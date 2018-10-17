package 基础知识.Java基础.IO.java的IO_Socket笔试题.a1列出某个目录下的所有文件;

import java.io.File;
import java.util.Arrays;

/**
 * @author: Gao HangHang
 * @date 2018/10/10
 */
public class Test {
    public static void main(String[] args) {
        File file = new File("/Users/gaohanghang/sql");
        File[] files = file.listFiles();
        Arrays.stream(files).filter(f -> f.isFile()).forEach(System.out::println);
    }
}
