import java.util.Arrays;

/**
 * Lambda 表达式
 *
 * @author: Gao HangHang
 * @date 2018/10/05
 */
public class Lambda {

    public static void main(String[] args) {
        Arrays.asList("a", "b", "d").forEach(System.out::println);
    }

}
