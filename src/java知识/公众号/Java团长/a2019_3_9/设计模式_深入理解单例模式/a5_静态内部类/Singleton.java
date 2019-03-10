package java知识.公众号.Java团长.a2019_3_9.设计模式_深入理解单例模式.a5_静态内部类;

/**
 * @Description: 静态内部类
 * @author: Gao Hang Hang
 * @date 2019/03/09 22:00
 */
public class Singleton {
    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.sInstance;
    }

    private static class SingletonHolder {
        private static final Singleton sInstance = new Singleton();
    }

    /*
        JVM已经为我们提供了同步控制，比如：

        - 在static {...}区块中初始化的数据
        - 访问final字段时

        第一次加载Singleton类时并不会初始化sInstance, 只有第一次调用getInstance方法时虚拟机加载
        SingletonHolder并初始化sInstance，这样不仅能确保线程安全也能确保Singleton类的唯一性，
        所以推荐使用静态内部类单例模式。
     */
}
