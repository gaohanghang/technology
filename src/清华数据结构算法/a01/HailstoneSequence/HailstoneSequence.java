package 清华数据结构算法.a01.HailstoneSequence;

/**
 * Hailstone Sequence问题Java实现
 *
 * @author: Gao HangHang
 * @date 2018/10/05
 */
public class HailstoneSequence {

    private static int hailstone(int num, boolean printer) {
        // 用于记录序列中的数的数量
        int count = 0;
        while (num != 1) {
            // 是否需要打印当前数
            if (printer) {
                System.out.print(num + " ");
            }
            // 根据公式，任何一个正整数num，如果为偶数则num折半，如果为奇数则num乘以3并加1
            num = num % 2 == 0 ? num / 2 : num * 3 + 1;
            // 计数器自增
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int param = 7;
        int count = hailstone(param, true);
        System.out.println(String.format("\n The %s's hailstone sequence count is :: %s",param, count));
    }

}
