package java知识.公众号.Java识堂.五分钟读懂工厂模式三兄弟;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date _2019/01/15 20:39
 */
public class Test {
    public static void main(String[] args) {
        Video car = VideoFactory.getVideo("java");
        // 学习Java视频
        car.study();
    }
}
