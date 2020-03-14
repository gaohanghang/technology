package java知识.公众号.骇客与画家.a2020.a3_14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2020-03-14 10:13
 **/
public class IterateHashMapExample3 {

    public static void main(String[] args) {
        Map<Integer, String> coursesMap = new HashMap<Integer, String>();
        coursesMap.put(1, "C");
        coursesMap.put(2, "C++");
        coursesMap.put(3, "Java");
        coursesMap.put(4, "Spring Framework");
        coursesMap.put(5, "Hibernate ORM framework");

        // 2. 使用 Iterator 遍历 HashMap KeySet
        for (Map.Entry<Integer, String> entry : coursesMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

}
