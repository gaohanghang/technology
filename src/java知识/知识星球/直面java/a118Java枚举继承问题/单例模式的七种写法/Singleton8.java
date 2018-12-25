package java知识.知识星球.直面java.a118Java枚举继承问题.单例模式的七种写法;

import java.io.Serializable;

/**
 * @author GaoHangHang
 * @date 2018/08/18 21:59
 **/
public class Singleton8 implements Serializable {
    public static Singleton8 INSTANCE = new Singleton8();

    protected Singleton8() {

    }

    private Object readResolve() {
        return INSTANCE;
    }
}
