package java知识.effctive_java_3.a3.单例模式;

/**
 * @Description: 第五种方式：既要懒汉式加载，又要线程安全：静态内部类。
 * @author: Gao Hang Hang
 * @create: 2019/04/28 20:07
 */
public class Single5 {

    private static Single5 single5;

    public Single5() {}

    public static Single5 getInstance() {
        return InnerClass.single5;
    }

    private static class InnerClass {
        private static final Single5 single5 = new Single5();
    }
}
