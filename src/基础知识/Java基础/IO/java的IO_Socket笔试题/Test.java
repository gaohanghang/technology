package 基础知识.Java基础.IO.java的IO_Socket笔试题;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

/**
 * 写一个方法,输入一个文件名和一个字符串,统计这个字符串在这个文件中出现的次数。
 *
 * @author: Gao HangHang
 * @date 2018/10/11
 */
public class Test {
    public static void main(String[] args) throws Exception {
        int hello = countWords("/Users/gaohanghang/sql/tt.txt", "hell");
        System.out.println(hello);
    }

    public static int countWords(String file, String find) throws Exception {
        int count = 0;
        Reader in = new FileReader(file);
        int c;
        while ((c = in.read()) != -1){
            while (c == find.charAt(0)) {
                for (int i = 1; i < find.length(); i++) {
                    c = in.read();
                    if (c != find.charAt(i)) break;
                    if (i == find.length() - 1) count++;
                }
            }
        }
        return count;
    }
}
