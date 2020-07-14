package 慕课网.装饰者模式.ioTest;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2020-07-12 20:15
 **/
public class IoTest {

    public static void main(String[] args) throws FileNotFoundException {

        // 构建抽象路径
        File file = new File("aaa.txt");
        // 公共file实例构建aaa.txt文件
        FileInputStream fis = new FileInputStream(file);
        // 使用缓输入流
        BufferedInputStream bf = new BufferedInputStream(fis);

    }

}
