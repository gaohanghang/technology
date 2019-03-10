package java知识.公众号.Java团长.a2019_3_9.设计模式_深入理解单例模式.a6_枚举;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2019/03/09 22:09
 */
public class Test {
    public static void main(String[] args) {
        Singleton singleton = Singleton.INSTANCE;
        singleton.doSomeThing();
    }

    /*
       使用枚举来实现单例控制会更加简洁，而且无偿提供了序列化机制，并由
       JVM从根本上提供保障，绝对防止多次实例化，是更简洁、高效、安全的实现单例的方式。
     */
}
