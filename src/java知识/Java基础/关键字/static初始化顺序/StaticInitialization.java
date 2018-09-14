package java知识.Java基础.关键字.static初始化顺序;

/*
  加上static限定的字段，是所谓的类字段，也就是说这个字段的拥有者不是对象而是类。
  无论创建多少对象，static数据都只有一份。

  类内总是先初始化static字段，再初始化一般字段。接着初始化构造器。但是如果不创建这个类的对
  像，那这个对象是不会进行初始化的，并且只执行一次。

  如下面的代码，在 StaticInitialization 类中，先初始化 static Table table = new Table();，然后
  才去初始化 Table 对象，不然是不会初始化的。
 */
/**
 * @author: Gao Hang Hang
 * @email: hanghang.gao@jingli365.com
 * @date 2018/09/10 下午9:29
 */
class Bowl {
    Bowl(int marker) {
        System.out.println("Bowl(" + marker + ")");
    }

    void f1(int marker) {
        System.out.println("f1("+ marker + ")");
    }
}

class Table {
    static Bowl bowl = new Bowl(1);
    Table() {
        System.out.println("Table()");

    }
    void f2(int marker) {
        System.out.println("f2(" + marker + ")");
    }
    static Bowl bowl2 = new Bowl(2);
}

class Cupboard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);
    Cupboard() {
        System.out.println("Cupboard()");
        bowl4.f1(2);
    }
    void f3(int marker) {
        System.out.println("f3(" + marker + ")");
    }
}

public class StaticInitialization {
    public static void main(String[] args) {
        System.out.println("Creating new Cupboard() in main");
        new Cupboard();
        System.out.println("creating new Cupboard() in main");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }
    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
} /* Output:
Bowl(1)
Bowl(2)
Table()
f1(1)
Bowl(4)
Bowl(5)
Bowl(3)
Cupboard()
f1(2)
Creating new Cupboard() in main
Bowl(3)
Cupboard()
f1(2)
Creating new Cupboard() in main
Bowl(3)
Cupboard()
f1(2)
f2(1)
f3(1)
*///:~

