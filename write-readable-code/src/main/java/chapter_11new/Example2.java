package main.java.chapter_11new;

import java.io.*;

/**
 * 纯工具代码
 *
 * @author: Gao HangHang
 * @date 2018/09/17
 */
public class Example2 {

    public void foo(String fileName) {
        try {
            System.out.println(readFileToString(fileName));
            // TODO
        } catch (Exception e) {
            // Exception
        }
    }

    public String readFileToString(String filePath) throws IOException {
        StringBuilder  currentLines   = new StringBuilder();
        File           file           = new File(filePath);
        FileReader     fr             = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fr);
        String         sCurrentLine;
        while ((sCurrentLine = bufferedReader.readLine()) != null) {
            currentLines.append(sCurrentLine).append("\n");
        }
        return currentLines.toString();
    }
}

