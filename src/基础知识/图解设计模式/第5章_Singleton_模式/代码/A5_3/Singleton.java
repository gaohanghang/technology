package 基础知识.图解设计模式.第5章_Singleton_模式.代码.A5_3;

public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
        System.out.println(" 生成了一个实例。");
        slowdown();
    }

    public static synchronized Singleton getInstance() {
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
