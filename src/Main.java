import java.util.IdentityHashMap;
import java.util.Map;

/**
 * @author GaoHangHang
 * @date 2018/08/10 16:07
 **/
public class Main {
    public static void main(String[] args) {
        String str1 = new String("key");
        String str2 = new String("key");
        System.out.println(str1 == str2);
        Map<String, String> map = new IdentityHashMap<>();
        map.put(str1, "value1");
        map.put(str2, "value2");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
        System.out.println("\"key\" containKey--->" + map.containsKey("key"));
        System.out.println("str1 containKey--->" + map.containsKey(str1));
        System.out.println("str2 containKey--->" + map.containsKey(str2));
        System.out.println("value--->" + map.get("key"));
        System.out.println("value--->" + map.get(str1));
        System.out.println("value--->" + map.get(str2));
    }
}
