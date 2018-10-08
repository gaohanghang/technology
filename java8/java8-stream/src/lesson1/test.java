package lesson1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author: Gao HangHang
 * @date 2018/10/07
 */
public class test {
    public static void main(String[] args) {
        DateTimeFormatter df        = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime     time      = LocalDateTime.now();
        String            localTime = df.format(time);
        System.out.println(localTime);
    }
}
