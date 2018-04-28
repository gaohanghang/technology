package java8日期;

import java.time.Instant;

/**
 * Created by GaoHangHang 2018-04-28 17:21
 * 表示时刻的 Instant
 *
 * Instant 和 Date 一样，表示一个时间戳，用于描述一个时刻，只不过它较 Date 而言，可以描述更加精确的时刻。并且 Instant 是时区无关的。
 * Date 最多可以表示毫秒级别的时刻，而 Instant 可以表示纳秒级别的时刻。例如：
 *
 * public static Instant now()：根据系统当前时间创建一个 Instant 实例，表示当前时刻
 * public static Instant ofEpochSecond(long epochSecond)：通过传入一个标准时间的偏移值来构建一个 Instant 实例
 * public static Instant ofEpochMilli(long epochMilli)：通过毫秒数值直接构建一个 Instant 实例
 *
 * 可以看到，Instant 和 Date 不同的是，它是时区无关的，始终是格林零时区相关的，也即是输出的结果始终格林零时区时间。
 **/
public class InstantTest {
    public static void main(String[] args) {
        // 创建 Instant 实例
        Instant instant = Instant.now();
        System.out.println(instant);

        Instant instant1 = Instant.ofEpochSecond(20);
        System.out.println(instant1);

        Instant instant2 = Instant.ofEpochSecond(30,100);
        System.out.println(instant2);

        Instant instant3 = Instant.ofEpochMilli(1000);
        System.out.println(instant3);
    }
}
