package java知识.Java基础.Java基础知识.static方法重写;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-10-03 21:30
 **/
public class Demo02 extends Demo01 {
    public void method1() {
        System.out.println("This is son non-static");
    }

    public static void method2() {
        System.out.println("This is son static");
    }

    public static void main(String[] args) {
        Demo01 d1 = new Demo01();
        Demo02 d2 = new Demo02();
        Demo01 d3 = new Demo02(); //父类引用指向子类对象
        d1.method1();
        d1.method2();
        d2.method1();
        d2.method2();
        d3.method1();
        d3.method2();
    }
}
