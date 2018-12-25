package 基础知识.Java基础.java8时间API;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * @author GaoHangHang
 * @date 2018/07/12 13:35
 **/
public class LocalDateTest {
    public static void main(String[] args) {
        //LocalDate代表一个IOS格式(yyyy-MM-dd)的日期，可以存储 生日、纪念日等日期。 获取当前的日期：
        java.time.LocalDate localDate = java.time.LocalDate.now();
        System.out.println("localDate: " + localDate); // localDate: 2018-07-12

        //LocalDate可以指定特定的日期，调用of或parse方法返回该实例：
        java.time.LocalDate of = java.time.LocalDate.of(2017, 07, 20);
        java.time.LocalDate parse = java.time.LocalDate.parse("2017-07-20");
        System.out.println(of);
        System.out.println(parse);

        //为今天添加一天，也就是获取明天
        java.time.LocalDate tomorrow = java.time.LocalDate.now().plusDays(1);
        //从今天减去一个月
        java.time.LocalDate prevMonth = java.time.LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println(tomorrow);
        System.out.println(prevMonth);

        //下面写两个例子，分别解析日期 2017-07-20，获取每周中的星期和每月中的日：
        DayOfWeek thursday = java.time.LocalDate.parse("2017-07-20").getDayOfWeek();
        System.out.println("周四：" + thursday);
        int twenty = java.time.LocalDate.parse("2017-07-20").getDayOfMonth();
        System.out.println("twenty: " + twenty);

        //试试今年是不是闰年:
        boolean leapYear = java.time.LocalDate.now().isLeapYear();
        System.out.println("是否闰年：" + leapYear);

        //判断是否在日期之前或之后:
        boolean notBefore = java.time.LocalDate.parse("2017-07-20").isBefore(java.time.LocalDate.parse("2017-07-22"));
        boolean isAfter = java.time.LocalDate.parse("2017-07-20").isAfter(java.time.LocalDate.parse("2017-07-22"));
        System.out.println("notBefore: " + notBefore);
        System.out.println("isAfter: " + isAfter);

        //获取这个月的第一天:
        java.time.LocalDate firstDayOfMonth = java.time.LocalDate.parse("2017-07-20").with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("这个月的第一天: " + firstDayOfMonth);
        firstDayOfMonth = firstDayOfMonth.withDayOfMonth(1);
        System.out.println("这个月的第一天: " + firstDayOfMonth);

        //判断今天是否是我的生日，例如我的生日是 2009-07-20

        java.time.LocalDate birthday = java.time.LocalDate.of(2009, 07, 20);
        MonthDay birthdayMd = MonthDay.of(birthday.getMonth(), birthday.getDayOfMonth());
        MonthDay today = MonthDay.from(java.time.LocalDate.now());
        System.out.println("今天是否是我的生日: " + today.equals(birthdayMd));


    }
}
