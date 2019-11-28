package java知识.java核心技术卷1.a5.a5_4;

import java.security.PublicKey;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/20 14:41
 */
public class Test {
    public static void main(String[] args) {
        // Integer n = null;
        // System.out.println( 2 * n); // Throws NullPointerException

        // Integer n = 1;
        // Double x = 2.0;
        // System.out.println(true ? n : x); // Prints 1.0

        triple(1);
    }

    public static void triple(int x) {
        x = 3 * x; // modifies local variable
    }
}
