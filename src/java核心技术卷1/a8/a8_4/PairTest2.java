package java核心技术卷1.a8.a8_4;

import java核心技术卷1.a8.a8_1.Pair;

import java.time.LocalDate;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date _2019/01/08 17:07
 */
public class PairTest2 {
    public static void main(String[] args) {
        LocalDate[] birthdays = {
                LocalDate.of(1906, 12, 9), // G. Hopper
                LocalDate.of(1815, 12, 10), // A. Lovelace
                LocalDate.of(1903, 12, 3), // J. von Neumann
                LocalDate.of(1910, 6, 22), // K. Zuse
        };
        Pair<LocalDate> mm = ArrayAlg.minmax(birthdays);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }
}

/**
 <T extends BoundingType>
 表示 T 应该是绑定类型的子类型(subtype)。T 和绑定类型可以是类， 也可以是接口。选 择关键字 extends 的原因是更接近子类的概念， 并且 Java 的设计者也不打算在语言中再添加 一个新的关键字(如 sub)。
 T extends Comparable & Serializable
 */
class ArrayAlg {
    /**
     * Gets the minimum and maximum of an array of objects of type T.
     * @param  a an array of objects of type T
     * @return a pair with the min and max value, or null if a is null or empty
     */
    public static <T extends Comparable> Pair<T> minmax(T[] a) {
        if (a == null || a.length == 0) return null;
        T min = a[0];
        T max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<>(min, max);
    }
}
