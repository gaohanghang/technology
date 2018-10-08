package java知识.知识星球.成神之路.第014期Stream相关.java8新特性全新的StreamAPI;

import java.util.function.Supplier;

/**
 * @author: Gao HangHang
 * @date 2018/10/08
 */
public class NaturalSupplier implements Supplier<Long> {

    long value = 0;

    @Override
    public Long get() {
        this.value = this.value + 1;
        return this.value;
    }
}
