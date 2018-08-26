package java知识.知识星球.直面java.a118Java枚举继承问题.单例模式的七种写法;

/**
 * 这种方式是Effective Java作者Josh Bloch 提倡的方式，它不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象，可谓是很坚强的壁垒啊，不过，
 * 个人认为由于1.5中才加入enum特性，用这种方式写不免让人感觉生疏，在实际工作中，我也很少看见有人这么写过。
 *
 * @author GaoHangHang
 * @date 2018/08/18 21:45
 **/
public enum  Singleton6 {
    INSATNCE;
    public void whateverMethod() {
    }
}
