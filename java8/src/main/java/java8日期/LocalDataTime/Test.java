package java8日期.LocalDataTime;

import java.time.LocalDate;

import static java.time.temporal.TemporalAdjusters.firstDayOfYear;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-11-09 21:14
 **/
public class Test {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = localDate.with(firstDayOfYear());
        System.out.println(localDate1);

    }

}
