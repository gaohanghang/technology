package main.java.文章.a2019_5_12.strategy;

/**
 * @Author Gao Hang Hang
 * @Description 策略上下文，这里就是根据类型路由到具体的实现类
 * @Date 2019-05-12 17:59
 **/
public class Context {

    private Strategy strategy;

    /**
     * 充值
     * @return
     */
    public Double calRecharge(Double charge, Integer type) {

        try{
            strategy= StrategyFactory.getInstance().creator(type);
        }catch (Exception e){
            //log
        }

        return strategy.calRecharge(charge);
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
