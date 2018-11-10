package java知识.尚学堂.a01java入门阶段.第三章控制语句;

/**
 * 测试for循环
 * for循环语句是支持迭代的一种通用结构，是最有效、最灵活的循环结构
 *
 * @author: Gao HangHang
 * @date 2018/11/04
 */
public class TestFor {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i < 100; i++) {
            sum = sum + i;
        }

        /**
         * 1.执行初始化语句：i=1;
         * 2.判断i<=100
         * 3.执行循环体
         * 4.步进迭代：i++
         * 5.回到第二步继续判断
         */
    }
}
