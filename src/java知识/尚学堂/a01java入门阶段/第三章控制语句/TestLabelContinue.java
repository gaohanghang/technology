package java知识.尚学堂.a01java入门阶段.第三章控制语句;

/**
 * 带标签的Break和Continue
 * <p>
 * “标签”是指后面跟一个冒号的标识符，例如：“label:”。
 * 对Java来说唯一用到标签的地方是在循环语句之前。而在循环之前设置标签的唯一理由是：我们希望在其中嵌套另一个循环，由于break和continue关键字通常只中断当前循环，但若随同标签使用，它们就会中断到存在标签的地方。
 * 在 “goto有害”论中，最有问题的就是标签，而非goto， 随着标签在一个程序里数量的增多，产生错误的机会也越来越多。
 * 但Java标签不会造成这方面的问题，因为它们的活动场所已被限死，不可通过特别的方式到处传递程序的控制权。由此也引出了一个有趣的问题：通过限制语句的能力，反而能使一项语言特性更加有用。
 *
 * @author: Gao HangHang
 * @date 2018/11/04
 */
public class TestLabelContinue {
    public static void main(String[] args) {
        //打印101-150之间的所有质数
        outer:
        for (int i = 101; i < 150; i++) {
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    continue outer;
                }
            }
            System.out.print(i + " ");
        }
    }
}
