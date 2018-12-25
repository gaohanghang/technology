package java知识.知识星球.直面java.a118Java枚举继承问题.单例模式的七种写法;

/**
 * 第三种 （饿汉）
 * <p>
 * 这种方式基于classloder机制，在深度分析Java的ClassLoader机制（源码级别）和Java类的加载、链接和初始化两个文章中有关于CLassload而机制的线程安全问题的介绍，避免了多线程的同步问题，
 * 不过，instance在类装载时就实例化，虽然导致类装载的原因有很多种，
 * 在单例模式中大多数都是调用getInstance方法， 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化instance显然没有达到lazy loading的效果。
 *
 * @author GaoHangHang
 * @date 2018/08/18 21:23
 **/
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return instance;
    }
}
