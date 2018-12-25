package java知识.知识星球.成神之路.第014期Stream相关.Java8中stream相关用法;

import java.util.function.Function;

/**
 * @author: Gao HangHang
 * @date 2018/10/09
 */
public class sumPerformance {
    public static void main(String[] args) {
        long number = 10000000L;
    }

    public static long sumPerformanceTest(Function<Long, Long> function, long number) {
        long maxValue = Long.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            long sum = function.apply(number);
            long end = System.nanoTime();
            System.out.println("Result: " + sum);
            long time = (end - start) / 1000000;

            if (time < maxValue) {
                maxValue = time;
            }
        }

        return maxValue;
    }
}
