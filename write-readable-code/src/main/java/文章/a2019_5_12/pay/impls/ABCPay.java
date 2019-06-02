package main.java.文章.a2019_5_12.pay.impls;

import main.java.文章.a2019_5_12.pay.Calc;

/**
 * @Author Gao Hang Hang
 * @Description
 * @Date 2019-05-12 17:55
 **/
public class ABCPay implements Calc {

    /**
     * 农业银行的结算实现类
     * 这边就是具体业务代码的实现方法
     * 优惠98折
     *
     */
    @Override
    public Double doCalculate(Double money) {
        return money*0.98;
    }
}
