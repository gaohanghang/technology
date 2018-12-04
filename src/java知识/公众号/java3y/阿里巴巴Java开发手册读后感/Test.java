package java知识.公众号.java3y.阿里巴巴Java开发手册读后感;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/01 6:54 PM
 */
public class Test {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("1","哈哈1");
        hashMap.put("2","哈哈2");
        hashMap.put("3","哈哈3");

        // 得到keySet，遍历keySet得到所有的key
        // Set<String> strings = hashMap.keySet();
        // Iterator<String> iterator = strings.iterator();
        // while (iterator.hasNext()) {
        //
        //     // HashMap的每个key
        //     String key = iterator.next();
        //
        //     // 通过key可以获得对应的value，如果有看过HashMap的同学知道get方法的时间复杂度是O(1)
        //     System.out.println("key = " + key + ", value = " + hashMap.get(key));
        // }

        // 得到entrySet，遍历entrySet得到结果
        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }

        hashMap.forEach((key, value) -> System.out.println("key = " + key + ", value = " + value));
    }
}
