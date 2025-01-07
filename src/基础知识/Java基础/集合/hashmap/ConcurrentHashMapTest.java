package 基础知识.Java基础.集合.hashmap;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2024-05-13 01:05
 **/
public class ConcurrentHashMapTest {
    public static void main(String[] args) {
        ConcurrentHashMap map = new ConcurrentHashMap();
        map.put(null, null);
        System.out.println(map);
    }
}
