package 基础知识.Java基础.java8时间API;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * @author GaoHangHang
 * @date 2018/07/12 16:37
 **/
public class PeriodTest {
    public static void main(String[] args) {
        //给初始化的日期添加5天:
        LocalDate initialDate = LocalDate.parse("2017-07-20");
        LocalDate finalDate = initialDate.plus(Period.ofDays(5));
        System.out.println("初始化日期: " + initialDate);
        System.out.println("加日期之后: " + finalDate);

        //周期API中提供给我们可以比较两个日期的差别，像下面这样获取差距天数:
        long between = ChronoUnit.DAYS.between(initialDate, finalDate);
        System.out.println("差距天数: " + between);
    }
}
