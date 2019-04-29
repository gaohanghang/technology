package java知识.effctive_java_3.a3;

/**
 * @Description: 1、饿汉式，线程安全
 * @author: Gao Hang Hang
 * @create: 2019/04/28 19:46
 */
public class Singleton {
    //创建静态变量并进行初始化，并且jvm加载时就会进行实例，保证该实例只有一个
    //但是对于多线程而言，这样的效率并不高，造成资源的浪费
    private static final Singleton instance = new Singleton();

    private Singleton() {} //将构造函数访问权限修改成private，即外部无法通过new进行实例化调用

    public static Singleton getInstance() {
        return instance;
    }
}
