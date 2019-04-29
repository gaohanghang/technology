package java知识.effctive_java_3.a3;

/**
 * @Description: 枚举实现单例
 * @author: Gao Hang Hang
 * @create: 2019/04/28 19:58
 */
public enum  Singleton2 {
    // 实例
    INSTANCE;

    public Singleton2 getInstance() {
        return INSTANCE;
    }
}
