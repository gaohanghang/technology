package java知识.公众号.漫画编程.a2019.a10_23.工厂模式;

import java知识.公众号.漫画编程.a2019.a10_23.UserPayService;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-10-23 23:07
 **/
public class UserPayServiceStrategyFactory {

    private static Map<String, UserPayService> services = new ConcurrentHashMap<String,UserPayService>();

    public  static UserPayService getByUserType(String type){
        return services.get(type);
    }

    public static void register(String userType,UserPayService userPayService){
        //Assert.notNull(userType,"userType can't be null");
        services.put(userType,userPayService);
    }

}
