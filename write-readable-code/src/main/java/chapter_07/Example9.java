package main.java.chapter_07;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 精确的描述方法的行为
 *
 * @author: Gao HangHang
 * @date 2018/09/15
 */
public class Example9 {

    /**
     * 返回此文件中有多少换行("\n")
     */
    int countLines(String fileName) {
        try {
            return Files.readAllLines(Paths.get(fileName)).size();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
