package 基础知识.单例模式的五种方式;

// 单例设计方案3(线程安全+效率)
public class Singleton03 {// 大对象

    private Singleton03() {
    }

    public static Singleton03 instance;

    public static Singleton03 getInstance() {
        if (instance == null) {
            synchronized (Singleton03.class) {
                if (instance == null) {
                    instance = new Singleton03();
                }
            }
        }
        return instance;
    }

}
