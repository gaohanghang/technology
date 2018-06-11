import java.util.Arrays;
import java.util.List;

/**
 * 变长参数
 *
 * @author GaoHangHang
 * @date 2018/06/12 0:53
 **/
public class VarArgs {

    public static List<String> asList(String[] names){
        return Arrays.asList(names);
    }

    public static void main(String[] args) {
        List<String> hello = Arrays.asList("王爵nice", "Gay冰", "A*熊");

    }

}