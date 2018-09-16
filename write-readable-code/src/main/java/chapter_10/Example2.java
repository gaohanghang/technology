package main.java.chapter_10;

/**
 * 减少控制变量
 *
 * @author: Gao HangHang
 * @date 2018/09/16
 */
public class Example2 {

    int foo = 10;
    int bar = 20;

    public void part1() {
        while (foo < bar) {
            if (!isDone()) {
                break;
            }
            foo++;
            if (foo > bar) {
                continue;
            }
        }
    }

    private boolean isDone() {
        return false;
    }
}
