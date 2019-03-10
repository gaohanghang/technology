package java知识.公众号.Java团长.a2019_3_9.设计模式_深入理解单例模式.a4_双重校验锁;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2019/03/09 21:45
 */
public class Singleton {
    /**
     * 注意此处使用德关键字 volatile,
     * 被volatile修饰的变量的值，将不会被本地线程缓存，
     * 所有对该变量的读写都是直接操作共享内存，从而确保多个线程能正确的处理该变量
     */
    private volatile static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    /*
        这里进行了两次判空，第一次是为了不必要的同步，
        第二次是在singleton等于null的情况下次才创建实例
     */
}
