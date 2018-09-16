package main.java.chapter_06new;

/**
 * 公布可能的陷阱
 *
 * @author: Gao HangHang
 * @date 2018/09/15
 */
public class Example6 {

    // 调用外部API发送邮件，1分钟后超时。
    void sendEmail(String to, String body) {

    }

    // 运行时间可以达到 0(标签数 * 标签深度)，小心深层嵌套的输入
    void fixBrokenHtml(String html) {

    }

    /**
     * 这个文件包含一些辅助方法，为我们文件系统提供了方便的接口。
     * 它处理的文件权限和一些其他的细节。
     */
    class BiezhiUtils {

    }

}
