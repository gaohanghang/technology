package java核心技术卷1.a3.a3_7.a3_7_1;

import java.io.Console;

/**
 * @Description: 读取输入 Console 只能用在标准输入、输出流未被重定向的原始控制台中使用，在 Eclipse 或者其他 IDE 的控制台是用不了的。
 * @author: Gao Hang Hang
 * @date 2018/11/30 7:23 PM
 */
public class Test {
    public static void main(String[] args) {
        Console console = System.console();
        if (console != null) {
            System.out.println("input data");
            String data = console.readLine();
            System.out.println("data=" + data);
            char[] pwds = console.readPassword();
            System.out.println("pwds=" + pwds);
            data = console.readLine("hello %s", "test");
            System.out.println(data);

            pwds = console.readPassword("hello password %s", "test");
            System.out.println(pwds);
            //输出
            console.format("fuck %s\n", "you");

            console.writer().println("finish");
            console.flush();


        } else {
            System.out.println("console==null");
        }
    }
}
