package java知识.公众号.Hollis.a2019.a4_14;

import java.util.concurrent.atomic.AtomicInteger;

public class CASTest {
    static AtomicInteger i = new AtomicInteger(0);

    public static void increment() {
        // 自增1并返回之后的结果
        i.incrementAndGet();
    }

    public static void main(String[] args) {
        increment();
        System.out.println(i);
    }
}
