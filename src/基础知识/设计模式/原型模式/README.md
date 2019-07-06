## 原型模式(Prototype)

# 前言

**原型模式**属于对象的**创建模式**。通过给出一个**原型对象**来指明所有创建的对象的**类型**，然后用这个**原型对象**提供的**复制办法**创建出更多**同类型**的对象。

## 原型模式的结构

**原型模式**要求对象实现一个可以**克隆自身**的接口(类型)。这样一来，通过**原型实例**创建新的对象，就不需要关心这个**实例本身**的类型，只需要实现**克隆自身**的方法，也而无需再去通过`new`来创建。

## 原型类型的表现形式

1. 简单形式
2. 登记形式

# 正文

## 简单形式

![](https://raw.githubusercontent.com/gaohanghang/images/master/img20190706132243.png)

### 相关角色

1. **客户(Client)角色**：**客户类**提出创建对象的请求；
2. **抽象原型(Prototype)角色**：这是一个抽象角色，通常由一个`Java`**接口**或者`Java`**抽象类**实现。此角色定义了的具体原型类所需的实现的方法。
3. **具体原型(Concrete Prototype)角色**：此角色需要实现**抽象原型角色**要求的**克隆相关**的**接口**。

### 示例代码

Prototype.java

```
/**
 * 抽象原型角色
 */
public abstract class Prototype {
    private String id;

    public Prototype(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * 克隆自身的方法
     * @return 一个从自身克隆出来的对象。
     */
    public abstract Prototype clone();
}
复制代码
```

ConcretePrototype1.java

```
public class ConcretePrototype1 extends Prototype {
    public ConcretePrototype1(String id) {
        super(id);
    }

    public Prototype clone() {
        Prototype prototype = new ConcretePrototype1(this.getId());
        return prototype;
    }
}
复制代码
```

ConcretePrototype2.java

```
public class ConcretePrototype2 extends Prototype {
    public ConcretePrototype2(String id) {
        super(id);
    }

    public Prototype clone() {
        Prototype prototype = new ConcretePrototype2(this.getId());
        return prototype;
    }
}
复制代码
```

### 运行结果



![img](https://user-gold-cdn.xitu.io/2018/7/13/16494294f047c26a?imageView2/0/w/1280/h/960/format/webp/ignore-error/1)



## 登记形式



![img](https://user-gold-cdn.xitu.io/2018/7/13/16494294f71f7b84?imageView2/0/w/1280/h/960/format/webp/ignore-error/1)



### 相关角色

1. **客户(Client)角色**：**客户类**提出创建对象的请求；
2. **抽象原型(Prototype)角色**：这是一个抽象角色，通常由一个`Java`**接口**或者`Java`**抽象类**实现。此角色定义了的具体原型类所需的实现的方法。
3. **具体原型(Concrete Prototype)角色**：此角色需要实现**抽象原型角色**要求的**克隆相关**的**接口**。
4. **原型管理器(Prototype Manager)角色**：提供各种**原型对象**的**创建**和**管理**。

### 示例代码

除了**原型管理器**`Prototype Manager`以外，**登记模式**和**简单模式**并无其他差异。

Prototype.java W

```
public interface Prototype {
    public Prototype clone();
    public String getName();
    public void setName(String name);
}
复制代码
```

ConcretePrototype1.java

```
public class ConcretePrototype1 implements Prototype {
    private String name;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        Prototype prototype = new ConcretePrototype1();
        prototype.setName(this.name);
        return prototype;
    }

    @Override
    public String toString() {
        return "ConcretePrototype1 [name=" + name + "]";
    }

}
复制代码
```

ConcretePrototype2.java

```
public class ConcretePrototype2 implements Prototype {
    private String name;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        Prototype prototype = new ConcretePrototype2();
        prototype.setName(this.name);
        return prototype;
    }

    @Override
    public String toString() {
        return "ConcretePrototype2 [name=" + name + "]";
    }
}
复制代码
```

PrototypeManager.java

```
public class PrototypeManager {
    /**
     * 用来记录原型的编号同原型实例的对象关系
     */
    private static Map<String, Prototype> map = new HashMap<>();

    /**
     * 私有化构造方法，避免从外部创建实例
     */
    private PrototypeManager() {
    }

    /**
     * 向原型管理器里面添加或者修改原型实例
     *
     * @param prototypeId 原型编号
     * @param prototype   原型实例
     */
    public static void setProtoType(String prototypeId, Prototype prototype) {
        map.put(prototypeId, prototype);
    }

    /**
     * 根据原型编号从原型管理器里面移除原型实例
     *
     * @param prototypeId 原型编号
     */
    public static void removePrototype(String prototypeId) {
        map.remove(prototypeId);
    }

    /**
     * 根据原型编号获取原型实例
     *
     * @param prototypeId 原型编号
     * @return 原型实例对象
     * @throws Exception 如果根据原型编号无法获取对应实例，则提示异常“您希望获取的原型还没有注册或已被销毁”
     */
    public static Prototype getPrototype(String prototypeId) throws Exception {
        Prototype prototype = map.get(prototypeId);

        if (prototype == null) {
            throw new Exception("您希望获取的原型还没有注册或已被销毁");
        }

        return prototype;
    }

}
复制代码
```

Client.java

```
public class Client {
    public static void main(String[] args) {
        try {
            // 创建第一个实例
            Prototype p1 = new ConcretePrototype1();
            // 注册第一个实例
            PrototypeManager.setProtoType("p1", p1);

            // 克隆第一个实例的原型
            Prototype p3 = PrototypeManager.getPrototype("p1").clone();
            p3.setName("张三");
            System.out.println("第一个实例的副本：" + p3);

            // 创建第二个实例
            Prototype p2 = new ConcretePrototype2();
            // 注册第二个实例
            PrototypeManager.setProtoType("p2", p2);

            // 克隆第二个实例的原型
            Prototype p4 = PrototypeManager.getPrototype("p2").clone();
            p4.setName("李四");
            System.out.println("第二个实例的副本：" + p4);

            // 注销第一个实例
            PrototypeManager.removePrototype("p1");
            // 再次克隆第一个实例的原型
            Prototype p5 = PrototypeManager.getPrototype("p1").clone();
            p5.setName("王五");
            System.out.println("第一个实例的副本：" + p5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
复制代码
```

### 运行结果

![](https://raw.githubusercontent.com/gaohanghang/images/master/img20190706132804.png)

## 两者之间的比较

简单形式和登记形式的原型模式各有其长处和短处。

1. 如果要创建的**原型对象**数据**较少**而且比较**固定**的话，可以采用**第一种**形式。在这种情况下，原型对象的引用可以由**客户端**自己保存。
2. 如果要创建的**原型对象**数据**不固定**的话，可以采用**第二种**形式。在这种情况下，客户端不保存对原型对象的引用，这个任务被交给**原型管理器**角色。在克隆一个对象之前，客户端可以查看管理员对象是否已经有一个满足要求的原型对象。如果有，可以从**原型管理器**角色中取得这个对象引用；如果没有，客户端就需要**自行复制**此原型对象。

# 总结

## 原型模式的优点

原型模式允许在运行时**动态**改变具体的**实现类型**。原型模式可以在**运行期间**，有客户来注册符合原型接口的实现类型，也可以动态的改变具体的实现类型，看起来接口没有任何变化，但是其实运行的已经是另外一个类实体了。**因为克隆一个原型对象就类似于实例化一个类**。

## 原型模式的缺点

原型模式最主要的缺点是每一个类都必须要配备一个**克隆方法**。配备克隆方法需要对类的功能进行**通盘考虑**，这对于全新的类来说并不是很难，但是对于已有的类来说并不容易。

