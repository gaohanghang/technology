package 基础知识.Java基础.IO.java的IO_Socket笔试题.a3判断一个文件或目录是否存在;

import java.io.File;

/**
 * @author: Gao HangHang
 * @date 2018/10/10
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(new File("/Users/gaohanghang/sql/cityCode.txt").exists());
    }
}
