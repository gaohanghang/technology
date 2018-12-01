package java知识.java核心技术.a3.a3_7.a3_7_3;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/11/30 8:59 PM
 */
public class a3_7_3 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(Paths.get("/Users/gaohanghang/myTest.txt"), "UTF-8");
        PrintWriter out = new PrintWriter("/Users/gaohanghang/myTest.txt", "UTF-8");
        out.write("1111");

        String dir = System.getProperty("user.dir");
        System.out.println(dir);
    }
}
