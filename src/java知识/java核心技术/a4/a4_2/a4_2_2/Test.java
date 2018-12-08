package java知识.java核心技术.a4.a4_2.a4_2_2;

import java.time.LocalDate;

/**
 * @Description: Java 类库中的 LocalDate 类
 * @author: Gao Hang Hang
 * @date 2018/12/08 11:52 AM
 */
public class Test {
    public static void main(String[] args) {
        LocalDate.now();

        LocalDate.of(1999, 12, 31);

        LocalDate newYearsEve = LocalDate.of(1999, 12, 31);

        int year = newYearsEve.getYear(); // 1999
        int month = newYearsEve.getMonthValue(); // 12
        int day = newYearsEve.getDayOfMonth(); // 31

        System.out.println(year + " " + month + " " + day);

        LocalDate aThousandDaysLater = newYearsEve.plusDays(1000);
        year = aThousandDaysLater.getYear(); // 2002
        month = aThousandDaysLater.getMonthValue(); // 09
        day = aThousandDaysLater.getDayOfMonth(); // 26

        System.out.println(year + " " + month + " " + day);
    }
}
