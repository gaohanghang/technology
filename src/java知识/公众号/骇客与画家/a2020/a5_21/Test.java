package java知识.公众号.骇客与画家.a2020.a5_21;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2020-05-21 20:51
 **/
public class Test {

    public static void print(int n) {
        if (n > 0) {
            print(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        print(100);
    }

}
