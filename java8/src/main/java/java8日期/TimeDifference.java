package java8日期;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class TimeDifference {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2017,7,12);
        LocalDate date1 = LocalDate.now();
        Period period = Period.between(date,date1);
        System.out.println(period.getYears() + "年" +
                period.getMonths() + "月" +
                period.getDays() + "天");

        LocalTime time = LocalTime.of(20,30);
        LocalTime time1 = LocalTime.of(23,59);
        Duration duration = Duration.between(time,time1);
        System.out.println(duration.toMinutes()+"分钟");
    }
}
