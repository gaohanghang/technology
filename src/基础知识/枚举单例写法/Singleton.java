package 基础知识.枚举单例写法;

/**
 * "双重校验锁"实现单例
 *
 * @author GaoHangHang
 * @date 2018/06/14 17:56
 **/
public class Singleton {
    private volatile static Singleton singleton;

    private Singleton() {
    }

    ;

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
