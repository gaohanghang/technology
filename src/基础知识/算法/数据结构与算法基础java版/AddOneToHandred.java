package 基础知识.算法.数据结构与算法基础java版;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/17 21:47
 */
public class AddOneToHandred {
    public static void main(String[] args) {
        int total = 0;
        int end = 100;

        // 使用for循环计算
        // for (int i = 0; i <= end; i++) {
        //     total += i;
        // }

        // 直接计算
        total = (1 + end) * end / 2;
        // 算法没有最好的，只有最适合的。

        // 打印结果
        System.out.println(total);
    }
}
