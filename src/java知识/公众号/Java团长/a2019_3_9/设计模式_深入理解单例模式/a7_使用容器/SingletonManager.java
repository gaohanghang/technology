package java知识.公众号.Java团长.a2019_3_9.设计模式_深入理解单例模式.a7_使用容器;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2019/03/09 22:13
 */
public class SingletonManager {
    private static Map<String, Object> objMap = new HashMap<>();

    private SingletonManager() {
    }

    public static void registerService(String key, Object instance) {
        if (!objMap.containsKey(key)) {
            objMap.put(key, instance);
        }
    }

    public static Object getService(String key) {
        return objMap.get(key);
    }

    /*
        这种是用SingletonManager 将多种单例类统一管理，在使用时根据key获取对象对应类型的对象。
        这种方式使得我们可以管理多种类型的单例，并且在使用时可以通过统一的接口进行获取操作，
        降低了用户的使用成本，也对用户隐藏了具体实现，降低了耦合度。
     */
}
