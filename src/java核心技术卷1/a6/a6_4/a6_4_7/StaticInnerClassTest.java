package java核心技术卷1.a6.a6_4.a6_4_7;

/**
 * @Description: This program demonstrates the use of static inner classes.
 * 该程序演示了静态内部类的使用
 * @author: Gao Hang Hang
 * @date 2018/12/27 20:10
 */
public class StaticInnerClassTest {
    public static void main(String[] args) {
        double[] d = new double[20];
        for (int i = 0; i < d.length; i++)
            d[i] = 100 * Math.random();
        ArrayAlg.Pair p = ArrayAlg.minmax(d);

    }
}

class ArrayAlg {

    /**
     * A pair of floating-point numbers
     * 一对浮点数
     */
    public static class Pair {
        private double first;
        private double second;

        /**
         * Constructs a pair from floating-point numbers
         * @param f
         * @param s
         */
        public Pair(double f, double s) {
            this.first = f;
            this.second = s;
        }

        /**
         * Returns the first number of the pair
         * @return the first number
         */
        public double getFirst() {
            return first;
        }

        /**
         * Returns the second number of the pair
         * @return the second number
         */
        public double getSecond() {
            return second;
        }
    }

    /**
     * Computes both the minimum and the maximum of an array
     * @param values an array of floating-point numbers
     * @return a pair whose first element is the minimum and whose second element
     * is the maximum
     * 一对，其第一个元素是最小元素，第二个元素是最大元素
     */
    public static Pair minmax(double[] values) {
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        for (double v : values) {
            if (min > v) min = v;
            if (max < v) max = v;
        }
        return new Pair(min, max);
    }
}
