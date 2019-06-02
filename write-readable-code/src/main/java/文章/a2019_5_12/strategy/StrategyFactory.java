package main.java.文章.a2019_5_12.strategy;

import java.util.HashMap;

/**
 * @Author Gao Hang Hang
 * @Description 策略工厂
 * @Date 2019-05-12 18:07
 **/
public class StrategyFactory {
    // 生成我们的工厂对象
    private static StrategyFactory factory = new StrategyFactory();

    public StrategyFactory() {
    }

    public static HashMap<Integer, String> source_map = new HashMap<>();

    static {
        // 通过注解加载到map
        source_map= (HashMap<Integer, String>) ClassUtil.getClasses("com.luffy.strategy.impl");
    }

    //创建我们要的对象
    public Strategy creator(int type)throws  Exception{

        String clazz=source_map.get(type);
        Class clazz_= Class.forName(clazz);
        return  (Strategy)clazz_.newInstance();

    }

    //返回工厂对象
    public static StrategyFactory getInstance(){
        return factory;
    }
}
