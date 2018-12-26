package java知识.java核心技术.a6.a6_1.a6_1_4;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @Description: 接口与抽象类
 * @author: Gao Hang Hang
 * @date 2018/12/24 14:38
 */
public class Test {
    public static void main(String[] args) {
        Path path = Paths.get("jdk1.8.0", "jre", "bin");
        System.out.println(path.toString());
    }
}
