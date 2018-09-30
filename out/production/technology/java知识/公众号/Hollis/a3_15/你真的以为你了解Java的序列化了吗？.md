# 你真的以为你了解Java的序列化了吗？

上一篇文章《[Java对象的序列化与反序列化](http://mp.weixin.qq.com/s?__biz=MzI3NzE0NjcwMg==&mid=2650120836&idx=1&sn=c83a980c0871faf607ae613092c69760&chksm=f36bbfa5c41c36b317c103f27b9d99c26aecba52e4bf614bd73dcadc1e4bc5ab8f99fb082eba&scene=21#wechat_redirect)》中，简单介绍了Java中对象的序列化和反序列化的一些基础知识。看文那篇文章后，有小伙伴留言说：我终于了解了Java的序列化了。我只想说：小伙子，你真的是图样图森破啊 。

通过那篇文章，读者可以学会如何对Java对象进行序列化和反序列化。但是，还有些原理性知识没有深入讲解。本文，在上一篇文章的基础上，抽丝剥茧，深入底层原理，主要围绕以下几个问题展开：

```java
怎么实现Java的序列化？

为什么实现了java.io.Serializable接口才能被序列化？

transient的作用是什么？

如果在序列化中破坏transitent的限制？

怎么自定义序列化策略？

自定义的序列化策略是如何被调用的？

ArrayList对序列化的实现有哪些好处

```

## 序列化基础知识

关于序列化的用法及基础知识，由于不是本文重点，这里不再详细介绍了，详情请参阅[Java对象的序列化与反序列化](http://mp.weixin.qq.com/s?__biz=MzI3NzE0NjcwMg==&mid=2650120836&idx=1&sn=c83a980c0871faf607ae613092c69760&chksm=f36bbfa5c41c36b317c103f27b9d99c26aecba52e4bf614bd73dcadc1e4bc5ab8f99fb082eba&scene=21#wechat_redirect)。这里只做简单回顾。

1、在Java中，只要一个类实现了`java.io.Serializable`接口，那么它就可以被序列化。

2、通过`ObjectOutputStream`和`ObjectInputStream`对对象进行序列化及反序列化。

3、虚拟机是否允许反序列化，不仅取决于类路径和功能代码是否一致，一个非常重要的一点是两个类的序列化 ID 是否一致（就是 `private static final long serialVersionUID`）

4、序列化并不保存静态变量。

5、要想将父类对象也序列化，就需要让父类也实现`Serializable` 接口。

6、transient 关键字的作用是控制变量的序列化，在变量声明前加上该关键字，可以阻止该变量被序列化到文件中，在被反序列化后，transient 变量的值被设为初始值，如 int 型的是 0，对象型的是 null。

7、服务器端给客户端发送序列化对象数据，对象中有一些数据是敏感的，比如密码字符串等，希望对该密码字段在序列化时，进行加密，而客户端如果拥有解密的密钥，只有在客户端进行反序列化时，才可以对密码进行读取，这样可以一定程度保证序列化对象的数据安全。

## ArrayList的序列化

为了深入的介绍序列化，我们这篇文章准备从Java源码中的ArrayList类入手。看看Java自身是如何使用序列化的。在介绍ArrayList序列化之前，先来考虑一个问题：

> 问：如何自定义的序列化和反序列化策略？

```
带着这个问题，我们来看java.util.ArrayList的源码
```

code 1

```java
public class ArrayList<E> extends AbstractList<E>
       implements List<E>, RandomAccess, Cloneable, java.io.Serializable
{
   private static final long serialVersionUID = 8683452581122892189L;
   transient Object[] elementData; // non-private to simplify nested class access
   private int size;
}
```

笔者省略了其他成员变量，从上面的代码中可以知道ArrayList实现了`java.io.Serializable`接口，那么我们就可以对它进行序列化及反序列化。因为负责保存元素的elementData是`transient`的，所以我们认为这个成员变量的内容不会被序列化而保留下来。我们写一个Demo，验证一下我们的想法：

code 2

```java
public static void main(String[] args) throws IOException, ClassNotFoundException {
       List<String> stringList = new ArrayList<String>();
       stringList.add("hello");
       stringList.add("world");
       stringList.add("hollis");
       stringList.add("chuang");
       System.out.println("init StringList" + stringList);
       ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("stringlist"));
       objectOutputStream.writeObject(stringList);

       IOUtils.close(objectOutputStream);
       File file = new File("stringlist");
       ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
       List<String> newStringList = (List<String>)objectInputStream.readObject();
       IOUtils.close(objectInputStream);
       if(file.exists()){
           file.delete();
       }
       System.out.println("new StringList" + newStringList);
   }
//init StringList[hello, world, hollis, chuang]
//new StringList[hello, world, hollis, chuang]
```

了解ArrayList的人都知道，ArrayList底层是通过数组实现的。那么数组`elementData`其实就是用来保存列表中的元素的。通过该属性的声明方式，我们认为，他应该是无法通过序列化持久化下来的。

>问：为什么code 2的结果却通过序列化和反序列化把List中的元素保留下来了呢？

## writeObject和readObject方法

在ArrayList中定义了来个方法： `writeObject`和`readObject`。

这里先给出结论:

> 在序列化过程中，如果被序列化的类中定义了writeObject 和 readObject 方法，虚拟机会试图调用对象类里的 writeObject 和 readObject 方法，进行用户自定义的序列化和反序列化。
>
> 如果没有这样的方法，则默认调用是 ObjectOutputStream 的 defaultWriteObject 方法以及 ObjectInputStream 的 defaultReadObject 方法。

也就述说，用户自定义的 writeObject 和 readObject 方法可以允许用户控制序列化的过程，比如可以在序列化的过程中动态改变序列化的数值。我们发现ArrayList中有这两个方法的实现，那么基本可以确定，elementData能被序列化持久下来，肯定和这两个方法有关，虽然他被声明为transitent，那么我们来看一下ArrayList类中这两个方法的具体实现：

code 3

```java
private void readObject(java.io.ObjectInputStream s)
       throws java.io.IOException, ClassNotFoundException {
       elementData = EMPTY_ELEMENTDATA;
       // Read in size, and any hidden stuff
       s.defaultReadObject();
       // Read in capacity
       s.readInt(); // ignored
       if (size > 0) {
           // be like clone(), allocate array based upon size not capacity
           ensureCapacityInternal(size);
           Object[] a = elementData;
           // Read in all elements in the proper order.
           for (int i=0; i<size; i++) {
               a[i] = s.readObject();
           }
       }
   }
```

code 4

```java
private void writeObject(java.io.ObjectOutputStream s)
       throws java.io.IOException{
       // Write out element count, and any hidden stuff
       int expectedModCount = modCount;
       s.defaultWriteObject();
       // Write out size as capacity for behavioural compatibility with clone()
       s.writeInt(size);
       // Write out all elements in the proper order.
       for (int i=0; i<size; i++) {
           s.writeObject(elementData[i]);
       }
       if (modCount != expectedModCount) {
           throw new ConcurrentModificationException();
       }
   }
```

通过上面两段代码，我们发现，raedObject方法和writeObjec方法中定义了关于elementData的序列化策略。现在，我们可以回答刚刚的问题了。

> 问：为什么code 2的结果却通过序列化和反序列化把List中的元素保留下来了呢？
>
> 答：ArrayList中定义了raedObject和writeObject方法，这两个方法中定义了elementData的序列化及反序列化策略。

那么，问题又来了。

> 问：为什么ArrayList要用这种方式来实现序列化呢？

### why transient

ArrayList实际上是动态数组，每次在放满以后自动增长设定的长度值，如果数组自动增长长度设为100，而实际只放了一个元素，那就会序列化99个null元素。为了保证在序列化的时候不会将这么多null同时进行序列化，ArrayList把元素数组设置为transient。

### why writeObject and readObject

前面说过，为了防止一个包含大量空对象的数组被序列化，为了优化存储，所以，ArrayList使用`transient`来声明`elementData`。 但是，作为一个集合，在序列化过程中还必须保证其中的元素可以被持久化下来，所以，通过重写`writeObject` 和 `readObject`方法的方式把其中的元素保留下来。

`writeObject`方法把`elementData`数组中的元素遍历的保存到输出流（ObjectOutputStream）中。

`readObject`方法从输入流（ObjectInputStream）中读出对象并保存赋值到`elementData`数组中。

至此，我们先试着来回答刚刚提出的问题：

> 问：为什么ArrayList要用这种方式来实现序列化呢？
>
> 答：避免elementData数组中过多的无用的null被序列化。
>
> 问：如何自定义序列化和反序列化策略？
>
> 答：可以通过在被序列化的类中增加writeObject 和 readObject方法。

那么问题又来了，虽然ArrayList中写了writeObject 和 readObject 方法，但是这两个方法并没有显示的被调用啊。

> 问：如果一个类中包含writeObject 和 readObject 方法，那么这两个方法是怎么被调用的呢?

## ObjectOutputStream

从code 4中，我们可以看出，对象的序列化过程通过ObjectOutputStream和ObjectInputputStream来实现的，那么带着刚刚的问题，我们来分析一下ArrayList中的writeObject 和 readObject 方法到底是如何被调用的呢？

为了节省篇幅，这里给出ObjectOutputStream的writeObject的调用栈：

> writeObject ---> writeObject0 --->writeOrdinaryObject--->writeSerialData--->invokeWriteObject

这里看一下invokeWriteObject：

```java
void invokeWriteObject(Object obj, ObjectOutputStream out)
       throws IOException, UnsupportedOperationException
   {
       if (writeObjectMethod != null) {
           try {
               writeObjectMethod.invoke(obj, new Object[]{ out });
           } catch (InvocationTargetException ex) {
               Throwable th = ex.getTargetException();
               if (th instanceof IOException) {
                   throw (IOException) th;
               } else {
                   throwMiscException(th);
               }
           } catch (IllegalAccessException ex) {
               // should not occur, as access checks have been suppressed
               throw new InternalError(ex);
           }
       } else {
           throw new UnsupportedOperationException();
       }
   }
```

其中`writeObjectMethod.invoke();`是关键，通过反射的方式调用writeObjectMethod方法。官方是这么解释这个writeObjectMethod的：

> class-defined writeObject method, or null if none

在我们的例子中，这个方法就是我们在ArrayList中定义的writeObject方法。通过反射的方式被调用了。

至此，我们先试着来回答刚刚提出的问题：

> 问：如果一个类中包含writeObject 和 readObject 方法，那么这两个方法是怎么被调用的?
>
> 答：在使用ObjectOutputStream的writeObject方法和ObjectInputStream的readObject方法时，会通过反射的方式调用。

> 问：如果一个类中包含writeObject 和 readObject 方法，那么这两个方法是怎么被调用的?
>
> 答：在使用ObjectOutputStream的writeObject方法和ObjectInputStream的readObject方法时，会通过反射的方式调用。

至此，我们已经介绍完了ArrayList的序列化方式。那么，不知道有没有人提出这样的疑问：

> 问：Serializable明明就是一个空的接口，它是怎么保证只有实现了该接口的方法才能进行序列化与反序列化的呢？

Serializable接口的定义：

```java
public interface Serializable {
}
```

如果尝试对一个未实现Serializable接口的类进行序列化，会抛出`java.io.NotSerializableException`。这是为什么呢？Serializable只是一个空接口，如何实现的呢？

其实这个问题也很好回答，我们再回到刚刚ObjectOutputStream的writeObject的调用栈：

> 其实这个问题也很好回答，我们再回到刚刚ObjectOutputStream的writeObject的调用栈：

writeObject0方法中有这么一段代码：

```java
if (obj instanceof String) {
       writeString((String) obj, unshared);
   } else if (cl.isArray()) {
       writeArray(obj, desc, unshared);
   } else if (obj instanceof Enum) {
       writeEnum((Enum<?>) obj, desc, unshared);
   } else if (obj instanceof Serializable) {
       writeOrdinaryObject(obj, desc, unshared);
   } else {
       if (extendedDebugInfo) {
           throw new NotSerializableException(
               cl.getName() + "\n" + debugInfoStack.toString());
       } else {
           throw new NotSerializableException(cl.getName());
       }
   }
```

在进行序列化操作时，会判断要被序列化的类是否是Enum、Array和Serializable类型，如果不是则直接抛出`NotSerializableException`。

> 问：Serializable明明就是一个空的接口，它是怎么保证只有实现了该接口的方法才能进行序列化与反序列化的呢？
>
> 答：在类的序列化过程中，会使用instanceof关键字判断一个类是否继承了Serializable类，如果没有，则直接抛出NotSerializableException异常。

## 总结

1、如果一个类想被序列化，需要实现Serializable接口。否则将抛出`NotSerializableException`异常，这是因为，在序列化操作过程中会对类型进行检查，要求被序列化的类必须属于Enum、Array和Serializable类型其中的任何一种。

2、在变量声明前加上该关键字，可以阻止该变量被序列化到文件中。

3、在类中增加writeObject 和 readObject 方法可以实现自定义序列化策略。

