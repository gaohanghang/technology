package java知识.知识星球.成神之路.第014期Stream相关.java8新特性全新的StreamAPI;

import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @author: Gao HangHang
 * @date 2018/10/08
 */
class PiSupplier implements Supplier<Double> {

    double sum = 0.0;
    double current = 1.0;
    boolean sign = true;

    @Override
    public Double get() {
        sum += (sign ? 4 : -4) / this.current;
        this.current = this.current + 2.0;
        this.sign = !this.sign;
        return sum;
    }
}

public class PiStream {
    public static void main(String[] args) {
        Stream<Double> piStream = Stream.generate(new PiSupplier());
        piStream.skip(100).limit(10).forEach(System.out::println);
    }
}
