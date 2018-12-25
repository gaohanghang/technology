package 工作.代码学习.dandelion;

import java.time.LocalDateTime;

/**
 * @author: Gao HangHang
 * @date 2018/09/19
 */
public abstract class TimeFormat {

    public final static IsoTimeFormat iso = new IsoTimeFormat();

    public final static YmdHmsTimeFormat ymdHms = new YmdHmsTimeFormat();

    public final static YmdTimeFormat ymd = new YmdTimeFormat();


    private final static TimeFormat[] timeFormats = new TimeFormat[]{iso, ymdHms, ymd};


    public abstract boolean matches(String s);

    public abstract LocalDateTime parse(String s);

    public abstract String toString(LocalDateTime t);


    public static LocalDateTime parseTime(String s) throws Exception {

        String s1 = s.trim();

        for (TimeFormat timeFormat : timeFormats) {
            if (timeFormat.matches(s1)) {
                return timeFormat.parse(s);
            }
        }


        throw new Exception(String.format("时间格式错误：%s\r\n使用iso、ymdHms、ymd格式无法识别所指定日期。", s));
    }
   /* public static void main(String[] args) throws Exception {
    	String s = "18:22";
		System.out.println(parseTime(s));
	}*/

}
