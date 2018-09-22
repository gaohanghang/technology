package 工作.代码学习;

import java.time.LocalDateTime;

/**
 * @author: Gao HangHang
 * @date 2018/09/19
 */
public class Conversion {

    public static LocalDateTime ymdToLocalDateTime(String ymd) {

        if (ymd == null) {
            return null;
        }

        ymd = ymd.trim();

        if (ymd.length() == 0) {
            return null;
        }

        String[] sections = ymd.split("-");
        return LocalDateTime.of(Integer.parseInt(sections[0]), Integer.parseInt(sections[1]), Integer.parseInt(sections[2]), 0, 0, 0);
    }

}
