package java8日期;

import java.time.LocalDate;

/**
 * Created by GaoHangHang 2018-04-28 17:27
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
