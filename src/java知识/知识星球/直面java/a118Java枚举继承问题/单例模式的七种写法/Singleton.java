package java知识.知识星球.直面java.a118Java枚举继承问题.单例模式的七种写法;

/**
 * 第一种 （懒汉，线程不安全）：
 *
 * @author GaoHangHang
 * @date 2018/08/18 21:08
 **/
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
