package java知识.Java基础.Java基础知识.Java的自动拆装箱;

/**
 * @author GaoHangHang
 * @date 2018/08/26 21:06
 **/
public class Test {
    public static void test(Integer num) {
        System.out.println("Integer参数的方法被调用...");
    }

    public static void test(int num) {
        System.out.println("int参数的方法被调用...");
    }

    public static void main(String[] args) {
        int i = 2;
        test(i); // int参数的方法被调用...
        Integer j = 4;
        test(j); // Integer参数的方法被调用...
    }
}
