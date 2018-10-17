package 基础知识.Java基础.IO.java的IO_Socket笔试题.a4读写文件;

import java.io.FileInputStream;
import java.io.FileWriter;

/**
 * @author: Gao HangHang
 * @date 2018/10/10
 */
public class Test {
    public static void main(String[] args) throws Exception {
        //读文件：
        FileInputStream fin = new FileInputStream("/Users/gaohanghang/sql/tt.txt");
        byte[] bs = new byte[100];
        while (true) {
            int len = fin.read(bs);
            if (len <= 0) break;
            System.out.println(new String(bs,0,len));
        }
        fin.close();
        //写文件：
        FileWriter fw = new FileWriter("/Users/gaohanghang/sql/tt.txt");
        fw.write("hello world!" + System.getProperty("line.separator"));
        fw.write("你好！北极！");
        fw.close();
    }
}
