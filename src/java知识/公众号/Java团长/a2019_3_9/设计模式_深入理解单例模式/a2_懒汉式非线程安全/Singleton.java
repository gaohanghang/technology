package java知识.公众号.Java团长.a2019_3_9.设计模式_深入理解单例模式.a2_懒汉式非线程安全;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2019/03/09 21:37
 */
public class Singleton {
    private static Singleton instance;
    private Singleton() {
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
