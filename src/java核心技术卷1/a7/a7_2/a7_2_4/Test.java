package java核心技术卷1.a7.a7_2.a7_2_4;

/**
 * @Description: finally子句
 * @author: Gao Hang Hang
 * @date 2018/12/29 17:49
 */
public class Test {
    public static void main(String[] args) {
        int f = f(2);
        System.out.println(f);
    }

    // 如果finally子句中也有一个 return 语句，这个返回值将会覆盖原始的返回值。
    public static int f(int n) {
        try {
            int r = n * n;
            return r;
        } finally {
            if (n == 2) return 0;
        }
    }
}
