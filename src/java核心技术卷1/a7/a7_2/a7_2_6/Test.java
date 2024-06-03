package java核心技术卷1.a7.a7_2.a7_2_6;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/30 15:38
 */
public class Test {
    public static void main(String[] args) {
        Throwable t = new Throwable();
        StringWriter out = new StringWriter();
        t.printStackTrace(new PrintWriter(out));
        String description = out.toString();
    }
}
