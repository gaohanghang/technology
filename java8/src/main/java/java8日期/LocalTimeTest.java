package java8日期;

import java.time.LocalTime;

/**
 * Created by GaoHangHang 2018-04-28 18:11
 * public static LocalTime now()：根据系统当前时刻获取其中的时间部分内容
 * public static LocalTime of(int hour, int minute)：显式传入小时和分钟来构建一个实例对象
 * public static LocalTime of(int hour, int minute, int second)：通过传入时分秒构造实例
 * public static LocalTime of(int hour, int minute, int second, int nanoOfSecond)：传入时分秒和毫微秒构建一个实例
 * public static LocalTime ofSecondOfDay(long secondOfDay)：传入一个长整型数值代表当前日已经过去的秒数
 * public static LocalTime ofNanoOfDay(long nanoOfDay)：传入一个长整型代表当前日已经过去的毫微秒数
 * <p>
 * public int getHour()
 * public int getMinute()
 * public int getSecond()
 * public int getNano()
 * public LocalTime withHour(int hour)：修改当前 LocalTime 实例中的 hour 属性并重新返回一个新的实例
 * public LocalTime withMinute(int minute)：类似
 * public LocalTime withSecond(int second)
 * 等等
 **/
public class LocalTimeTest {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime localTime1 = LocalTime.of(23, 59);
        System.out.println(localTime1);

        LocalTime localTime2 = LocalTime.ofSecondOfDay(10);
        System.out.println(localTime2);
    }

}
