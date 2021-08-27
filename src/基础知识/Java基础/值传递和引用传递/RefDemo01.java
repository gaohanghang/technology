package 基础知识.Java基础.值传递和引用传递;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2021-08-27 15:15
 **/
public class RefDemo01 {

    public static void main(String[] args) {
        // 实际参数：实参
        int x = 10;
        call(x);
        System.out.println("x最终的值是多少：" + x);
    }

    // 在方法体中参数是指行参
    public static void call(int i) {
        // 这个 i 是实参的一个内容拷贝，也就是说此时的 i 不是真正的 x 那个值，而是拷贝的 x 的值
        i = 20;
        System.out.println("改变后的值：" + i);
    }

}
