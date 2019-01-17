package java知识.公众号.Java识堂._2019.a1_13从计算机的角度理解volatile关键字;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2019/01/17 15:15
 */
public class Singleton {

    private volatile static Singleton uniqueInstance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
