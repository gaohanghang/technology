package java知识.尚学堂.a01java入门阶段.第三章控制语句;

/**
 * 测试递归
 *
 * @author: Gao HangHang
 * @date 2018/11/01
 */
public class TestRecursion01 {

    public static void main(String[] args) {
        a();
    }

    static int count = 0;

    static void a() {
        System.out.println("a");
        count++;
        if (count < 10) {
            a();
        } else {
            return;
        }

    }

    static void b() {
        System.out.println("b");
    }

}
