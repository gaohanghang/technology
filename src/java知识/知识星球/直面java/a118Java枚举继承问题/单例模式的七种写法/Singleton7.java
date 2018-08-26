package java知识.知识星球.直面java.a118Java枚举继承问题.单例模式的七种写法;

/**
 * 第七种（双重校验锁）
 *
 * 这个是第二种方式的升级版，俗称双重检查锁定，在JDK1.5之后，双重检查锁定才能够正常达到单例效果。
 *
 * 总结 有两个问题需要注意：
 *
 * 1、如果单例由不同的类装载器装入，那便有可能存在多个单例类的实例。假定不是远端存取，例如一些
 * servlet容器对每个servlet使用完全不同的类 装载器，这样的话如果有两个servlet访问一个单例类，它们就都会有各自的实例。
 *
 * 2、如果Singleton实现了java.io.Serializable接口，那么这个类的实例就可能被序列化和复原。不管怎
 * 样，如果你序列化一个单例类的对象，接下来复原多个那个对象，那你就会有多个单例类的实例。
 *
 * @author GaoHangHang
 * @date 2018/08/18 21:47
 **/
public class Singleton7 {
    private volatile static Singleton7 singleton;
    private Singleton7 (){}
    public static Singleton7 getSingleton() {
        if (singleton == null) {
            synchronized (Singleton7.class) {
                if (singleton == null) {
                    singleton = new Singleton7();
                }
            }
        }
        return singleton;
    }
}
