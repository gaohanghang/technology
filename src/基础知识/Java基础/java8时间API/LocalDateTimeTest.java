package 基础知识.Java基础.java8时间API;

import java.time.LocalDateTime;
import java.time.Month;

/**
 * @author GaoHangHang
 * @date 2018/07/12 15:04
 **/
public class LocalDateTimeTest {
    public static void main(String[] args) {
        /**
         * LocalDateTime
         * LocalDateTime是用来表示日期和时间的，这是一个最常用的类之一。
         */

        // 获取当前的日期和时间:
        LocalDateTime now = LocalDateTime.now();
        System.out.println("现在: " + now);

        //下面使用静态方法和字符串的方式分别创建LocalDateTime对象
        LocalDateTime.of(2017, Month.JULY, 20, 15, 18);
        LocalDateTime.parse("2017-07-20T15:18:00");

        LocalDateTime tomorrow = now.plusDays(1);
        System.out.println("明天的这个时间: " + tomorrow);
        LocalDateTime minusTowHour = now.minusHours(2);
        System.out.println("两小时前: " + minusTowHour);

        //这个类也提供一系列的get方法来获取特定单位:
        Month month = now.getMonth();
        System.out.println("当前月份: " + month);

    }
}
