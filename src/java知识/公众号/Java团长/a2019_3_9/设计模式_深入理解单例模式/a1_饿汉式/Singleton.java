package java知识.公众号.Java团长.a2019_3_9.设计模式_深入理解单例模式.a1_饿汉式;

/**
 * @Description: 1、恶汉式
 * @author: Gao Hang Hang
 * @date 2019/03/09 21:20
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}
