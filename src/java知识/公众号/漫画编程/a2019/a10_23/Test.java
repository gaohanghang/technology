package java知识.公众号.漫画编程.a2019.a10_23;

import java.math.BigDecimal;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-10-23 23:05
 **/
public class Test {

    public static void main(String[] args) {
        UserPayService strategy = new VipPayService();
        BigDecimal quote = strategy.quote(BigDecimal.valueOf(300));
        System.out.println("普通会员商品的最终价格为：" + quote.doubleValue());

        strategy = new SuperVipPayService();
        quote = strategy.quote(BigDecimal.valueOf(300));
        System.out.println("超级会员商品的最终价格为：" + quote.doubleValue());
    }

}
