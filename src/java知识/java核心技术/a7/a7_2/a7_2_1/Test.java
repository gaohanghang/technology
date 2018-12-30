package java知识.java核心技术.a7.a7_2.a7_2_1;

import edu.princeton.cs.algs4.In;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/29 17:01
 */
public class Test {
    public static void main(String[] args) {

    }

    public void read(String filename) {
        try {
            InputStream in = new FileInputStream(filename);
            int b;
            while ((b = in.read()) != -1) {
                // process input 处理输入
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void read2(String filename) {
        try {
            InputStream in = new FileInputStream(filename);
            int b;
            while ((b = in.read()) != -1){
                // process input
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
