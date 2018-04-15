package 基础知识.图解设计模式.第5章_Singleton_模式.代码;

public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton() {
        System.out.println("生成了一个实例。");
    }
    public static Singleton getInstance() {
        return singleton;
    }
}
