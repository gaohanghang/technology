package java知识.Java基础.Java基础知识.单例模式.Java利用枚举实现单例模式;

/**
 * @author GaoHangHang
 * @date 2018/08/26 14:53
 **/
public enum Type {
    A,B,C,D;

    static int value;
    public static int getValue() {
        return value;
    }

    String type;
    public String getType() {
        return type;
    }

    /*
    在原有的基础上，添加了类方法和实例方法。我们把Type看做一个类，那么enum中静态的域和方法，都可以视作类方法。和我们调用普通的静态方法一样，这里调用类方法也是通过  Type.getValue()即可调用，访问类属性也是通过Type.value即可访问。
    下面的是实例方法，也就是每个实例才能调用的方法。那么实例是什么呢？没错，就是A，B，C，D。所以我们调用实例方法，也就通过 Type.A.getType()来调用就可以了。
    最后，对于某个实例而言，还可以实现自己的实例方法。再看下下面的代码：
     */
}
