package 工作.代码学习.dandelion;

import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: Gao HangHang
 * @date 2018/09/19
 */
public class IsoTimeFormat extends TimeFormat {
    private final static Pattern pattern = Pattern.compile("([0-9]+)-([0-9]+)-([0-9]+)T([0-9]+):([0-9]+):([0-9]+)(\\.([0-9]+))?Z");


    @Override
    public boolean matches(String s) {
        return pattern.matcher(s).matches();
    }

    @Override
    public LocalDateTime parse(String s) {

        Matcher m = pattern.matcher(s.trim());
        m.find();
        return LocalDateTime.of(
                Integer.parseInt(m.group(1)),
                Integer.parseInt(m.group(2)),
                Integer.parseInt(m.group(3)),
                Integer.parseInt(m.group(4)),
                Integer.parseInt(m.group(5)),
                Integer.parseInt(m.group(6)),
                m.groupCount() == 9 ? Integer.parseInt(m.group(8)) : 0
        );
    }

    @Override
    public String toString(LocalDateTime t) {
        return String.format("%d-%02d-%02dT%02d:%02d:%02d.%03dZ", t.getYear(), t.getMonth().getValue(), t.getDayOfMonth(), t.getHour(), t.getMinute(), t.getSecond(), (int) (t.getNano() / 1000000));
    }
}
