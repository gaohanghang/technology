package java知识.知识星球.成神之路.第014期Stream相关.java8新特性全新的StreamAPI;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: Gao HangHang
 * @date 2018/10/08
 */
class FibonacciSupplier implements Supplier<Long> {

    long a = 0;
    long b = 1;

    @Override
    public Long get() {
        long x = a + b;
        a = b;
        b = x;
        return a;
    }
}

public class FibonacciStream {
    public static void main(String[] args) {
        Stream<Long> fibonacci = Stream.generate(new FibonacciSupplier());
        //fibonacci.limit(10).forEach(System.out::println);

        List<Long> list = fibonacci.skip(20).limit(10).collect(Collectors.toList());
        System.out.println(list);
    }
}
