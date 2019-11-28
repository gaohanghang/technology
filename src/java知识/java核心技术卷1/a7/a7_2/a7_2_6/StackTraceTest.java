package java知识.java核心技术卷1.a7.a7_2.a7_2_6;

import java.util.Scanner;

/**
 * A progrom that displays a trace feature of a recursive method call.
 * @Description: 分析堆栈轨迹元素
 * @author: Gao Hang Hang
 * @date 2018/12/30 15:49
 */
public class StackTraceTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        factorial(n);
    }

    /**
     * Computer the factorial of a number
     * @param n a non-negative integer 非负整数
     * @return n! = 1 * 2 * ... * n
     */
    public static int factorial(int n) {
        System.out.println("factorial(" + n + "):");
        Throwable t = new Throwable();
        StackTraceElement[] frams = t.getStackTrace();
        for (StackTraceElement f : frams) {
            System.out.println(f);
        }
        int r;
        if (n <= 1) {
            r = 1;
        } else {
            r = n * factorial(n - 1);
        }
        System.out.println("return " + r);
        return r;
     }
}

