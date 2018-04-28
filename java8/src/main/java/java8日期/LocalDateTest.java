package java8日期;

import java.time.LocalDate;

/**
 * Created by GaoHangHang 2018-04-28 17:27
 *
 * 处理日期的 LocalDate
 * 不同于 Calendar 既能处理日期又能处理时间，java.time 的新式 API 分离开日期和时间，用单独的类进行处理。LocalDate 专注于处理日期相关信息。
 * LocalDate 依然是一个不可变类，它关注时间中年月日部分，我们可以通过以下的方法构建和初始化一个 LocalDate 实例：
 *
 * public static LocalDate now()：截断当前系统时间的年月日信息并初始化一个实例对象
 * public static LocalDate of(int year, int month, int dayOfMonth)：显式指定年月日信息
 * public static LocalDate ofYearDay(int year, int dayOfYear)：根据 dayOfYear 可以推出 month 和 dayOfMonth
 * public static LocalDate ofEpochDay(long epochDay)：相对于格林零时区时间的日偏移量
 *
 * 需要注意一点，LocalDate 会根据系统中当前时刻和默认时区计算出年月日的信息。
 * 除此之外，LocalDate 中还有大量关于日期的常用方法：
 *
 * public int getYear()：获取年份信息
 * public int getMonthValue()：获取月份信息
 * public int getDayOfMonth()：获取当前日是这个月的第几天
 * public int getDayOfYear()：获取当前日是这一年的第几天
 * public boolean isLeapYear()：是否是闰年
 * public int lengthOfYear()：获取这一年有多少天
 * public DayOfWeek getDayOfWeek()：返回星期信息
 * 等等
 **/
public class LocalDateTest {
    public static void main(String[] args) {
        // 构建 LocalDate 实例
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = LocalDate.of(2017,7,22);
        System.out.println(localDate1);

        LocalDate localDate2 = LocalDate.ofYearDay(2018,100);
        System.out.println(localDate2);

        LocalDate localDate3 = LocalDate.ofEpochDay(10);
        System.out.println(localDate3);
    }
}
