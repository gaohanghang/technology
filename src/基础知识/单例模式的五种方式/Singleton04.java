package 基础知识.单例模式的五种方式;

// 单例设计方案四(小对象频繁用) 饿汉式
public class Singleton04 {

    private Singleton04() {
    }

    /**
     * 类加载时创建
     */
    private static final Singleton04 instance = new Singleton04();

    /**
     * 此方法中因为没有阻塞问题所以适合频繁访问
     */
    public static Singleton04 getInstance() {
        return instance;
    }

}
