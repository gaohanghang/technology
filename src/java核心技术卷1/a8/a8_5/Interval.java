package java核心技术卷1.a8.a8_5;

import java.io.Serializable;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date _2019/01/08 17:57
 */
public class Interval<T extends Comparable & Serializable> implements Serializable {
    private T lower;
    private T upper;

    public Interval(T first, T second) {
        if (first.compareTo(second) <= 0) {
            lower = first;
            upper = second;
        } else {
            lower = second;
            upper = first;
        }
    }
}
