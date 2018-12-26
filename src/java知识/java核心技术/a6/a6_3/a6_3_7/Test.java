package java知识.java核心技术.a6.a6_3.a6_3_7;

/**
 * @Description: 处理 lambda 表达式
 * @author: Gao Hang Hang
 * @date 2018/12/25 17:21
 */
public class Test {
    public static void main(String[] args) {
        repeat(10, () -> System.out.println("Hello, World!"));
    }

    public static void repeat(int n, Runnable action) {
        for (int i = 0; i < n; i++) {
            action.run();
        }
    }
}
