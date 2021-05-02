package 基础知识.Java多线程.syn;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2021-05-02 15:10
 **/
public class OrderNumGenerator {
    // 全局订单id
    public static int count = 0;
    public static Object lock = new Object();

    public String getNumber() {
        synchronized (lock) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
            return simpleDateFormat.format(new Date()) + "-" + ++count;
        }
    }

}
