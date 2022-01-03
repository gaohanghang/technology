package java核心技术卷1.a4.a4_6.a4_6_8;

/**
 * @Description: 对象析构与 finalize 方法
 * @author: Gao Hang Hang
 * @date 2018/12/12 20:18
 */
public class Test {
    public static void main(String[] args) {
        System.runFinalizersOnExit(true); // 可以确保 finalizer 方法在 Java 关闭前被调用
    }
}
