package main.java.chapter_09;

/**
 * 用作解释的变量
 *
 * @author: Gao HangHang
 * @date 2018/09/16
 */
public class Example1 {

    public void part1() {
        String line = "hello : world";
        if ("hello".equals(line.split(":")[0].trim())) {
            // TODO
        }
    }

    public void part2() {
        String line  = "hello : world";
        String hello = line.split(":")[0].trim();
        if ("hello".equals(hello)) {
            // TODO
        }
    }

}
