package java知识.公众号.芋道源码.a2019_2_4;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2019/02/04 12:55
 */
public class BenzFactory implements Factory {
    @Override
    public Car getCar() {
        return new Benz();
    }
}
