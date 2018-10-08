package java知识.知识星球.成神之路.第014期Stream相关.java8新特性全新的StreamAPI;

import java.util.stream.Stream;

/**
 * @author: Gao HangHang
 * @date 2018/10/08
 */
class NaturalSupplierTest {
    public static void main(String[] args) {
        Stream<Long> natural = Stream.generate(new NaturalSupplier());
        natural.map((x) -> {
            return x * x;
        }).limit(10).forEach(System.out::println);
    }
}
