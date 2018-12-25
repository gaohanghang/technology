package 工作.代码学习.dandelion;

import java.time.LocalDateTime;
import java.util.regex.Pattern;

/**
 * @author: Gao HangHang
 * @date 2018/09/19
 */
public class YmdHmsTimeFormat extends TimeFormat {

    private final static Pattern pattern = Pattern.compile("((.*?)-(.*?)-(.*?)(\\s)+(.*?):(.*?):(.*?))|((.*?)-(.*?)-(.*?)(\\s)+(.*?):(.*?))");


    @Override
    public boolean matches(String s) {
        return pattern.matcher(s).matches();
    }

    @Override
    public LocalDateTime parse(String s) {

        s = s.trim();
        int pos = s.indexOf(" ");
        String[] ymd = s.substring(0, pos).trim().split("-");
        String[] hms = s.substring(pos + 1).trim().split(":");

        return LocalDateTime.of(
                Integer.parseInt(ymd[0]),
                Integer.parseInt(ymd[1]),
                Integer.parseInt(ymd[2]),
                Integer.parseInt(hms[0]),
                Integer.parseInt(hms[1]),
                hms.length == 2 ? 0 : Integer.parseInt(hms[2]));
    }

    @Override
    public String toString(LocalDateTime t) {

        if (t == null) {
            return null;
        } else {
            return String.format("%d-%02d-%02d %02d:%02d:%02d", t.getYear(), t.getMonth().getValue(), t.getDayOfMonth(), t.getHour(), t.getMinute(), t.getSecond());
        }
    }

}
