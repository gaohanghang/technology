package main.java.chapter_08;

/**
 * 三目运算符
 *
 * @author: Gao HangHang
 * @date 2018/09/15
 */
public class Example3 {

    int hour;

    public void part1() {
        String timeString = (hour >= 12) ? "pm" : "am";

        if (hour >= 12) {
            timeString = "pm";
        } else {
            timeString = "am";
        }
    }

    public int part2() {

        int exponent = 20; // 计算出来的值
        int mantissa = -1; // 为了演示写死了
        if (exponent >= 0) {
            return mantissa * (1 << exponent);
        }
        return mantissa / (1 << exponent);

        //return mantissa / (1 << exponent) : mantissa / (1 << exponent);

    }

}
