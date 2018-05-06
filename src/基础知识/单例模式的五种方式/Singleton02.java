package 基础知识.单例模式的五种方式;

// 单例设计方案2(线程安全单例)
public class Singleton02 {

    private Singleton02() {
    }

    private static Singleton02 instance;

    public static synchronized Singleton02 getInstance() {
        if (instance == null) {
            instance = new Singleton02();
        }
        return instance;
    }

}
