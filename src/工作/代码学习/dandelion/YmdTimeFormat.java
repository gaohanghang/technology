package 工作.代码学习.dandelion;

import java.time.LocalDateTime;
import java.util.regex.Pattern;

/**
 * @author: Gao HangHang
 * @date 2018/09/19
 */
public class YmdTimeFormat extends TimeFormat {

    private final static Pattern pattern = Pattern.compile("(.*?)-(.*?)-(.*?)");


    @Override
    public boolean matches(String s) {
        return pattern.matcher(s).matches();
    }

    @Override
    public LocalDateTime parse(String s) {

        String[] ymd = s.trim().split("-");

        return LocalDateTime.of(
                Integer.parseInt(ymd[0]),
                Integer.parseInt(ymd[1]),
                Integer.parseInt(ymd[2]),
                0,
                0,
                0);
    }

    @Override
    public String toString(LocalDateTime t) {

        if (t == null) {
            return null;
        }
        else {
            return String.format("%d-%02d-%02d", t.getYear(), t.getMonth().getValue(), t.getDayOfMonth());
        }
    }

}
