package java知识.java核心技术.a8.a8_1;

import java.time.LocalDate;
import java.util.Date;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2019/01/02 11:06
 */
public class Test {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        Date date = java.sql.Date.valueOf(now);
        System.out.println(date.toString());
    }
}
