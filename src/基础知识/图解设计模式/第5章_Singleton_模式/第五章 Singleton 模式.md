# 第五章 Singleton 模式

只有一个实例

## 5.1 Singleton 模式

- 想确保任何情况下都绝对只有一个实例
- 想在程序中表现出“只存在一个实例”

## 5.2 示例程序 

### Singleton 类

> 代码清单 5-1 Singleton类（Singleton.java）

```java
public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton() {
        System.out.println("生成了一个实例。");
    }
    public static Singleton getInstance() {
        return singleton;
    }
}
```

### Main类

> 代码清单 5-2 使用 Singleton 模式的Main 类（Main.java）

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (obj1 == obj2) {
            System.out.println("obj1与obj2是相同的实例。");
        } else {
            System.out.println("obj1与obj2是不同的实例。");
        }
        System.out.println("End.");
    }
}
```

图 5-2 展示了程序的运行结果

```java
Start.
生成了一个实例。
obj1与obj2是相同的实例。
End.
```

## 5.3 Singleton 模式中的登场角色





##  5.7 练习题 

- 习题 5-1

> 代码清单 5-3 非 Singleton 模式的 TicketMaker 类（TicketMaker.java）

```java
public class TicketMaker {
    private int ticket = 1000;
    public int getNextTicketNumber() {
        return ticket++;
    }
}
```

**答案**

> 代码清单 A5-1	Singleton 模式的 TicketMaker 类（TicketMaker.java）

```java
public class TicketMaker {
    private int ticket = 1000;

    private static TicketMaker singleton = new TicketMaker();

    private TicketMaker() {
    }

    public static TicketMaker getInstance() {
        return                            singleton;
    }

    public synchronized int getNextTicketNumber() {
        return ticket++;
    }
}
```

> 代码清单 A5-2	调用 TicketMaker 类的 Main 类（Main.java）

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ":" + TicketMaker.getInstance().getNextTicketNumber());
        }
        System.out.println("End.");
    }
}
```

> 图 A5-1 运行结果

```
Start.
0:1000
1:1001
2:1002
3:1003
4:1004
5:1005
6:1006
7:1007
8:1008
9:1009
End.
```

- 习题 5-2 

请编写 Triple 类，实现最多只能生成3个 Triple 类的实例，实例编号分别为 0,1,2 且可以通过 getInstance (int id) 来获取该编号对应的实例（在第 10 章中也出现了这样的类）。

> 代码清单 A5-3	Triple 类（Triple.java）

```java
public class Triple {
    private static Triple[] triple = new Triple[]{
            new Triple(0),
            new Triple(1),
            new Triple(2),
    };
    private int id;

    private Triple(int id) {
        System.out.println("The instance " + id + " is created.");
        this.id = id;
    }

    public static Triple getInstance(int id) {
        return triple[id];
    }

    @Override
    public String toString() {
        return "Triple{" +
                "id=" + id +
                '}';
    }
}
```

> 代码清单 A5-4	调用 Triple 类的 Main 类（Main.java）

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        for (int i = 0; i < 9; i++) {
            Triple triple = Triple.getInstance(i % 3);
            System.out.println(i + ":" + triple);
        }
        System.out.println("End.");
    }
}
```

> 图 A5-2	运行结果

```
Start.
The instance 0 is created.
The instance 1 is created.
The instance 2 is created.
0:Triple{id=0}
1:Triple{id=1}
2:Triple{id=2}
3:Triple{id=0}
4:Triple{id=1}
5:Triple{id=2}
6:Triple{id=0}
7:Triple{id=1}
8:Triple{id=2}
End.
```

- 习题 5-3

某位开发人员编写了如下的  Singleton 类（代码清单 5-4 ）。但这并非严格的 Singleton 模式。请问是为什么呢？

```java
public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
        System.out.println(" 生成了一个实例。");
    }

    public static Singleton getInstance () {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
```

这是因为在多个线程几乎同时调用 Singleton.getInstances 方法是，可能会生成多个实例

> 代码清单 A5-5 多个线程调用 Singleton.getInstances 方法（Main.java）

```java
public class Main extends Thread {
    public static void main(String[] args) {
        System.out.println("Start.");
        new Main("A").start();
        new Main("B").start();
        new Main("C").start();
        System.out.println("End.");
    }
    public void run() {
        Singleton obj = Singleton.getInstance();
        System.out.println(getName() + ": obj = " + obj);
    }
    public Main(String name) {
        super(name);
    }
}
```

> 代码清单 A5-6 为了确保能生成多个实例，我们故意降低了程序处理速度（Singleton.java）

```java
public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
        System.out.println(" 生成了一个实例。");
//        slowdown();
    }

    public static Singleton getInstance () {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    private void slowdown() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
```

> 图 A5-3 运行结果示例

```
Start.
End.
 生成了一个实例。
 生成了一个实例。
 生成了一个实例。
A: obj = 第五章.Singleton模式.A5_3.Singleton@b20568f
B: obj = 第五章.Singleton模式.A5_3.Singleton@35d7e55a
C: obj = 第五章.Singleton模式.A5_3.Singleton@698b3761
```

在以上代码中，如下条件判断是线程不安全的。

```java
if (singleton == null) {
  singleton = new Singleton();
}
```

在使用 singleton == null 判断第一个实例是否为 null 后，执行了下面的语句。

singleton = new Singleton();

但是，在赋值之前，其他线程可能会进行 singleton == null 判断。

因此，只有像代码清单 A5-7 中那样，定义 getInstance 方法为 synchronized 方法后才是严谨的 Singleton 模式

```java
public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
        System.out.println(" 生成了一个实例。");
        slowdown();
    }

    public static synchronized Singleton getInstance () {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    private void slowdown() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
```

