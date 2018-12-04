package java知识.公众号.java3y.阿里巴巴Java开发手册读后感;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/02 12:54 PM
 */
public class Test2 {
    // 1. 在方法内部使用，没有线程安全问题
    private static final String FORMAT = "yyyy-MM-dd HH:mm:ss";

    public String getFormat(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(FORMAT);
        return dateFormat.format(date);
    }

    // 2. 每次使用德是否加锁
    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public void getFormat() {
        synchronized (SIMPLE_DATE_FORMAT) {
            SIMPLE_DATE_FORMAT.format(new Date());
        }
    }

    // 3. 使用ThreadLocal，每个线程都有自己的SimpleDateFormat对象，互不干扰
    private static final ThreadLocal<DateFormat> DATE_FORMAT = new ThreadLocal<DateFormat>() {
        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd");
        }
    };


    public static void main(String[] args) {
        // 4. 使用DateTimeFormatter(This class is immutable and thread-safe.)
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(timeFormatter.format(LocalDateTime.now()));
    }
}
