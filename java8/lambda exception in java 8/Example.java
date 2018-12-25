import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author GaoHangHang
 * @date 2018/07/28 21:35
 **/
public class Example {

    public static List<Class> finClass(List<String> names) {
        return names.stream()
                .map(className -> LambdaExceptionUtil.uncheck(Class::forName, className))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        try {
            List<Class> classes = finClass(Arrays.asList("Hello"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
