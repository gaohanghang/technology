import java.util.HashMap;
import java.util.Map;

/**
 * 泛型
 *
 * 泛型规范数据结构，泛型的本质是参数化类型，所操作的数据被指定为一个参数
 *
 * @author GaoHangHang
 * @date 2018/06/12 0:33
 **/
public class Generic<T> {

    public T getById() {
        return null;
    }

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();

        Generic<Long> generic = new Generic<>();

    }
}
