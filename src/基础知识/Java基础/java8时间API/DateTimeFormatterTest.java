package 基础知识.Java基础.java8时间API;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 日期格式化
 * <p>
 * 在日常开发中我们用到最多的也许就是日期、时间的格式化了，那在Java8种该如何操作呢？
 *
 * @author GaoHangHang
 * @date 2018/07/12 16:30
 **/
public class DateTimeFormatterTest {
    public static void main(String[] args) {
        //日期格式化
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("默认格式化: " + now);
        System.out.println("自定义格式化: " + now.format(dateTimeFormatter));
        LocalDateTime localDateTime = LocalDateTime.parse("2017-07-20 15:27:44", dateTimeFormatter);
        System.out.println("字符串转LocalDateTime: " + localDateTime);


        // 也可以使用DateTimeFormatter的format方法将日期、时间格式化为字符串
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dateString = dateTimeFormatter2.format(LocalDate.now());
        System.out.println("日期转字符串: " + dateString);
    }
}
