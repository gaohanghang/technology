package java知识.尚学堂.a01java入门阶段.第三章控制语句;

/**
 * 测试continue
 * continue用于结束本次循环，继续循环下一次
 * <p>
 * continue 语句用在循环语句体中，用于终止某次循环过程，即跳过循环体中尚未执行的语句，
 * 接着进行下一次是否执行循环的判定。
 * <p>
 * 1. continue用在while，do-while中，continue 语句立刻跳到循环首部，越过了当前循环的其余部分。
 * <p>
 * 2. continue用在for循环中，跳到for循环的迭代因子部分。
 *
 * @author: Gao HangHang
 * @date 2018/11/04
 */
public class TestContinue {
    //把100~150之间不能被3整除的数据输出，并且每行输出5个
    public static void main(String[] args) {
        int count = 0;// 定义计数器
        for (int i = 100; i < 150; i++) {
            //如果是3的倍数，则跳出本次循环，继续继续下一次循环
            if (i % 3 == 0) {
                continue;
            }
            //否则（不是3的倍数），输出该数
            System.out.print(i + "、 ");
            count++;// 每输出一个数，计数器加1
            if (count % 5 == 0) {
                System.out.println();
            }
        }
    }
}
