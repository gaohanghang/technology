# 为什么需要

## 场景
   
开发一个能够存储各种类型对象（比如：String 对象、Integer 对象等）的容器（容器就是存储数据的，可以是对象，可以是数组等等）。


## 解决方案

### 在 JDK 1.5 之前
    
在 JDK 1.5 之前是没有泛型的，最好的办法是开发一个能够存储和检索 Object 类型本身的容器，然后再将该对象用于各种类型时进行类型转换。


```java
public class ObjectContainer {
   public Object obj;
}
```
虽然这个容器会达到预期效果，但就我们的目的而言，它并不是最合适的解决方案。它不是类型安全的（Java 的编译器对于类型转换的错误是检测不到的，在运行时执行到 checkcast这个字节码指令时，如果类型转换错误才会抛出 ClassCastException ），并且要求在检索封装对象时使用显式类型转换（向下转型），因此有可能引发运行时异常。

测试方法

```java
public static void main(String[] args) {
   ObjectContainer myObj = new ObjectContainer();
   // 这里发生向上转型
   myObj.obj = "Test";       
   // 检索封装对象，发生向下转型
   String myStr = (String) myObj.obj; 
   System.out.println("myStr: " + myStr);
}
```

> 注意：一个面试点，发生向下转型的必要条件是先发生向上转型。

### 从 JDK 1.5 开始

从 JDK 1.5 开始出现了泛型，使用泛型可以很好的解决我们的场景需求。在实例化时为所使用的容器分配一个类型，也称泛型类型，这样就可以创建一个对象来存储所分配类型的对象。泛型类型可以看成一种弱类型（类似于 js 中的 var，定义的时候你可以随便定义，使用的时候就需要给出具体类型），这意味着可以通过执行泛型类型调用分配一个类型，将用分配的具体类型替换泛型类型。然后，所分配的类型将用于限制容器内使用的值，这样就无需进行类型转换，还可以在编译时提供更强的类型检查。

```java
// 根据这个代码来看，泛型类型就是 T。泛型类型也可以称为泛型形参。
public class ObjectContainer<T>{
   public Object obj;
}
```
## 测试方法
  
> 代码里的注释很重要！很重要！很重要！建议多看几遍。






