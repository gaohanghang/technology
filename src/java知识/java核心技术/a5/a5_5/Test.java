package java知识.java核心技术.a5.a5_5;

import java.util.Objects;

/**
 * @Description: 参数数量可变的方法
 * @author: Gao Hang Hang
 * @date 2018/12/20 22:23
 */
public class Test {
    public static void main(String[] args) {
        System.out.println();
        double m = max(3.1, 40.4, -5);
    }

    public class PrintStream {
        public PrintStream(String fmt, Object... args) {

        }
    }

    public static double max(double... values) {
        double largest = Double.NEGATIVE_INFINITY;
        for (double v : values) if (v > largest) largest = v;
        return largest;
    }
}
