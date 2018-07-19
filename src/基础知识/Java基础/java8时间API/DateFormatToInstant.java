package 基础知识.Java基础.java8时间API;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

/**
 * 与遗留代码转换
 *
 * 在之前的代码中你可能出现了大量的Date类，如何将它转换为Java8种的时间类呢？
 *
 * @author GaoHangHang
 * @date 2018/07/12 16:42
 **/
public class DateFormatToInstant {
    public static void main(String[] args) {
        //Date和Instant互相转换
        Date date = Date.from(Instant.now());
        Instant instant = date.toInstant();

        //Date转换为LocalDateTime
        //LocalDateTime localDateTime = LocalDateTime.from(new Date());
        //System.out.println(localDateTime);


        //LocalDateTime转Date
        //Date date2 = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());

        // LocalDate转Date
        Date date3 = Date.from(LocalDate.now().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }
}
