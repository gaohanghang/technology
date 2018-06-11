import java.util.Arrays;
import java.util.List;

/**
 * for each
 *
 * @author GaoHangHang
 * @date 2018/06/12 0:30
 **/
public class ForEach {

    public static void main(String[] args) {

        int[] arr = {1, 4, 5, 7};

        for (int i : arr) {
            System.out.println(i);
        }

        List<String> names = Arrays.asList("王爵nice", "Gay冰", "A*熊");
        for (String name : names) {
            System.out.println(name);
        }
    }

}