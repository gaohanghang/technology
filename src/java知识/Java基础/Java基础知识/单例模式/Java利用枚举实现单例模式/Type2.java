package java知识.Java基础.Java基础知识.单例模式.Java利用枚举实现单例模式;

/**
 * @author GaoHangHang
 * @date 2018/08/26 14:59
 **/
public enum  Type2 {
    A{
        public String getType() {
            return "I will not tell you";
        }
    },B,C,D;

    static int value;
    public static int getValue() {
        return value;
    }

    String type;
    public String getType() {
        return type;
    }

    /*
    这里，A实例后面的{…}就是属于A的实例方法，可以通过覆盖原本的方法，实现属于自己的定制。
     */
}
