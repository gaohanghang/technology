package 基础知识.设计模式.原型模式.my;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-07-06 13:12
 **/
public class PrototypeManager {
    /**
     * 用来记录原型的编号同原型实例的对象关系
     */
    private static Map<String, Prototype> map = new HashMap<>();

    /**
     * 私有化构造方法，避免从外部创建实例
     */
    private PrototypeManager() {
    }

    /**
     * 向原型管理器里面添加或者修改原型实例
     *
     * @param prototypeId 原型编号
     * @param prototype   原型实例
     */
    public static void setProtoType(String prototypeId, Prototype prototype) {
        map.put(prototypeId, prototype);
    }

    /**
     * 根据原型编号从原型管理器里面移除原型实例
     *
     * @param prototypeId 原型编号
     */
    public static void removePrototype(String prototypeId) {
        map.remove(prototypeId);
    }

    /**
     * 根据原型编号获取原型实例
     *
     * @param prototypeId 原型编号
     * @return 原型实例对象
     * @throws Exception 如果根据原型编号无法获取对应实例，则提示异常“您希望获取的原型还没有注册或已被销毁”
     */
    public static Prototype getPrototype(String prototypeId) throws Exception {
        Prototype prototype = map.get(prototypeId);

        if (prototype == null) {
            throw new Exception("您希望获取的原型还没有注册或已被销毁");
        }

        return prototype;
    }

}

