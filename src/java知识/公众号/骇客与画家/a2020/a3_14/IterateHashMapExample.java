package java知识.公众号.骇客与画家.a2020.a3_14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Description https://www.yuque.com/gaohanghang/og37t5/gaglgg
 * @Author Gao Hang Hang
 * @Date 2020-03-14 09:10
 **/
public class IterateHashMapExample {

    public static void main(String[] args) {
        // 1. 使用 Iterator 迭代 HashMap EntrySet
        Map<Integer, String> coursesMap = new HashMap<Integer, String>();
        coursesMap.put(1, "C");
        coursesMap.put(2, "C++");
        coursesMap.put(3, "Java");
        coursesMap.put(4, "Spring Framework");
        coursesMap.put(5, "Hibernate ORM framework");

        Iterator<Map.Entry<Integer, String>> iterator = coursesMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

}
