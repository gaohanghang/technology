package java知识.java核心技术.a6.a6_3.a6_3_7;

import java.util.function.IntConsumer;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/25 17:38
 */
public class Test2 {
    public static void main(String[] args) {
        repeat(10, i -> System.out.println("Countdown: " + (9 - i)));
    }

    public static void repeat(int n, IntConsumer action) {
        for (int i = 0; i < n; i++) action.accept(i);
    }
}
