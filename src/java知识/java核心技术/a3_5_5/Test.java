package java知识.java核心技术.a3_5_5;

/**
 * 自增与自减运算符
 */
public class Test {
    public static void main(String[] args) {

        // int n = 12;
        // n++;
        // System.out.println(n);

        int m = 7;
        int n = 7;
        int a = 2 * ++m; // now a is 16, m is 8
        int b = 2 * n++; // now b is 14, n is 8

        System.out.println(a);
        System.out.println(b);
        System.out.println(m);
        System.out.println(n);
    }
}
