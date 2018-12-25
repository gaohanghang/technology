package java知识.Java基础.开源工具包;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.StopWatch;

/**
 * @author GaoHangHang
 * @date 2018/06/06 16:57
 **/
public class TimeTest {
    public static void main(String[] args) {
        //格式化日期输出
        System.out.println(DateFormatUtils.format(System.currentTimeMillis(), "yyyy-MM-dd HH:mm:ss"));
        //2018-06-06 16:59:53

        //秒表
        StopWatch sw = new StopWatch();
        sw.start();
        sw.stop();
        sw.getTime();
    }
}
