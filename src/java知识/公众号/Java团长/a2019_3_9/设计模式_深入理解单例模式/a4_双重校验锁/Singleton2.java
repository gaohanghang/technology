package java知识.公众号.Java团长.a2019_3_9.设计模式_深入理解单例模式.a4_双重校验锁;

/**
 * @author Gao Hanghang
 * @version 1.0
 * @description
 * @date 2024-08-19 15:09
 **/
public class Singleton2 {

    private static volatile Singleton2 instacne;

    private Singleton2() {
    }

    public static Singleton2 getInstance(){
        if (instacne == null) {
            synchronized (Singleton2.class) {
                if (instacne == null) {
                    instacne = new Singleton2();
                }
            }
        }
        return instacne;
    }

}
