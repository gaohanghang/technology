package main.java.文章.a2019_5_12.strategy;

/**
 * @Author Gao Hang Hang
 * @Description
 * @Date 2019-05-12 17:40
 **/
public interface Strategy {

    /**
     * 根据金额进行结算
     * @param charge 金额
     * @return
     */
    public Double calRecharge(Double charge);
}
