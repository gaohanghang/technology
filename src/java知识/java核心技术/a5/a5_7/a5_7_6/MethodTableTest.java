package java知识.java核心技术.a5.a5_7.a5_7_6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description: This program shows shows how to invoke methods through reflection.
 * @author: Gao Hang Hang
 * @date 2018/12/21 20:25
 */
public class MethodTableTest {
    public static void main(String[] args) throws Exception {
        // get method pointers to the square and sqrt methods
        Method square = MethodTableTest.class.getMethod("square", double.class);
        Method sqrt = Math.class.getMethod("sqrt", double.class);

        // print tables o f x- and y-values

        printTable(1, 10, 10, square);
        printTable(1, 10, 10, sqrt);
    }

    /**
     * Return the square of a number
     * @param x a number
     * @return x squared
     */
    public static double square(double x) {
        return x * x;
    }

    /**
     * Prints a table with x- and y-values for a method
     *
     */
    public static void printTable(double from, double to, int n, Method f) throws Exception {
        // print out the method as table header
        System.out.println(f);
        double dx = (to - from) / (n - 1);

        for (double x = from; x <= to; x += dx) {
            double y = (Double) f.invoke(null, x);
            System.out.println("%10.4f | ");
        }
    }
}
