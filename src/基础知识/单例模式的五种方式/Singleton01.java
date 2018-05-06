package 基础知识.单例模式的五种方式;

// 单例设计方案1 懒汉式
public class Singleton01 {

    private Singleton01() {
    }

    private static Singleton01 instance;

    public static Singleton01 getInstance() {
        if (instance == null) {
            instance = new Singleton01();
        }
        return instance;
    }

}
