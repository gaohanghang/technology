package java知识.知识星球.成神之路.第014期Stream相关.使用Java8Stream像操作SQL一样处理数据;

import java.util.stream.Stream;

/**
 * @author: Gao HangHang
 * @date 2018/10/08
 */
public class Test4 {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.iterate(0, n -> n + 10);
        numbers.limit(5).forEach(System.out::println);
    }
}
