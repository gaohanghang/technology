package 基础知识.Java基础.java8时间API;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * @author GaoHangHang
 * @date 2018/07/12 15:04
 **/
public class LocalTimeTest {
    public static void main(String[] args) {
        /**
         * LocalTime表示一个时间，而不是日期，下面介绍一下它的使用方法。
         *
         * 获取现在的时间，输出15:01:22.144
         */
        LocalTime now = LocalTime.now();
        System.out.println("现在的时间: " + now);

        //将一个字符串时间解析为LocalTime，输出15:02
        LocalTime nowTime = LocalTime.parse("15:02");
        System.out.println("时间是: " + nowTime);

        //使用静态方法of创建一个时间
        LocalTime nowTime2 = LocalTime.of(15, 02);
        System.out.println("时间是: " + nowTime2);

        //使用解析字符串的方式并添加一小时，输出16:02
        LocalTime nextHour = LocalTime.parse("15:02").plus(1, ChronoUnit.HOURS);
        System.out.println("下一个小时: " + nextHour);

        //获取时间的小时、分钟
        int hour = LocalTime.parse("15:02").getHour();
        System.out.println("小时: " + hour);
        int minute = LocalTime.parse("15:02").getMinute();
        System.out.println("分钟: " + minute);

        //我们也可以通过之前类似的API检查一个时间是否在另一个时间之前、之后
        boolean isBefore = LocalTime.parse("15:02").isBefore(LocalTime.parse("16:02"));
        boolean isAfter2 = LocalTime.parse("15:02").isAfter(LocalTime.parse("16:02"));
        System.out.println("isBefore: " + isBefore);
        System.out.println("isAfter: " + isAfter2);

        //在LocalTime类中也将每天的开始和结束作为常量供我们使用:
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
    }
}
