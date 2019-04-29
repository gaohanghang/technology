package java知识.effctive_java_3.a3.单例模式;

import java.io.Serializable;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @create: 2019/04/28 20:02
 */
public class Single6 implements Serializable {

    private static Single6 single6;

    private Single6() {}

    public static Single6 getInstance() {
        return single6;
    }

    private static class InnerClass{
        private static final Single6 single6 = new Single6();
    }

    /**
     * 重写此方法，防止反序列化破坏单例机制，这是因为：反序列化的机制在反序列号的时候，会判断如果实现
     * 了serializable或者externalizable接口的类中包含readResolve方法的话，
     * 会直接调用readResolve方法来获取实例。
     * @return
     */
    public Object readResolve() {
        return InnerClass.single6;
    }
}
