package java知识.尚学堂.a01java入门阶段.第三章控制语句;

/**
 * 测试循环语句中的break
 * break用于强行退出循环，不执行循环中剩余的语句
 *
 * @author: Gao HangHang
 * @date 2018/11/04
 */
public class TestBreak {
    public static void main(String[] args) {
        int total = 0;//定义计数器
        System.out.println("Begin");
        while (true) {
            total++;// 每循环一次计数器加1
            int i = (int) Math.round(100 * Math.random());
            System.out.println(i);
            // 当i等于88时，退出循环
            if (i == 88) {
                break;
            }
        }
        // 输出循环的次数
        System.out.println("Game over, used " + total + " times.");
    }
}
