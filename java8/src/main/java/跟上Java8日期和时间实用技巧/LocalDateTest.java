package 跟上Java8日期和时间实用技巧;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/09/13 下午8:14
 */
public class LocalDateTest {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate：" + localDate);

        LocalDate.of(2017, 07, 20);
        LocalDate.parse("2017-07-20");

        LocalDate tomorrow = LocalDate.now().plusDays(1);

        LocalDate prevMonth = LocalDate.now().minus(1, ChronoUnit.MONTHS);

    }

}
