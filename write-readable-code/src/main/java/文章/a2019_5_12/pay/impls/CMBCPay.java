package main.java.文章.a2019_5_12.pay.impls;

import main.java.文章.a2019_5_12.pay.Calc;

/**
 * @Author Gao Hang Hang
 * @Description
 * @Date 2019-05-12 17:46
 **/

public class CMBCPay implements Calc {

    /**
     * 工商银行的结算实现类
     * 这边就是具体业务代码的实现方法
     * 5元手续费
     * @return
     */
    public Double doCalculate(Double money) {

        return money + 5;
    }
}
