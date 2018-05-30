package java知识.公众号.Hollis.a5_20;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by GaoHangHang 2018-05-25 22:00
 **/
public class Main2 {

    public static void main(String[] args) throws Exception {
        Map<String, String> map = new HashMap<>();
        map.put("hollis1", "hollischuang");
        map.put("hollis2", "hollischuang");
        map.put("hollis3", "hollischuang");
        map.put("hollis4", "hollischuang");
        map.put("hollis5", "hollischuang");
        map.put("hollis6", "hollischuang");
        map.put("hollis7", "hollischuang");
        map.put("hollis8", "hollischuang");
        map.put("hollis9", "hollischuang");
        map.put("hollis10", "hollischuang");
        map.put("hollis11", "hollischuang");
        map.put("hollis12", "hollischuang");

        Class<?> mapType = map.getClass();

        Method capacity = mapType.getDeclaredMethod("capacity");
        capacity.setAccessible(true);
        System.out.println("capacity : "+ capacity.invoke(map));

        Field size = mapType.getDeclaredField("size");
        size.setAccessible(true);
        System.out.println("size : " + size.get(map));

        Field threshold = mapType.getDeclaredField("threshold");
        threshold.setAccessible(true);
        System.out.println("threshold : " + threshold.get(map));

        Field loadFactor = mapType.getDeclaredField("loadFactor");
        loadFactor.setAccessible(true);
        System.out.println("loadFactor : " + loadFactor.get(map));

        map.put("hollis13", "hollischuang");
        Method capacity2 = mapType.getDeclaredMethod("capacity");
        capacity2.setAccessible(true);
        System.out.println("capacity2 : " + capacity2.invoke(map));

        Field size2 = mapType.getDeclaredField("size");
        size2.setAccessible(true);
        System.out.println("size2 : " + size2.get(map));

        Field threshold2 = mapType.getDeclaredField("threshold");
        threshold2.setAccessible(true);
        System.out.println("threshold2 : " + threshold2.get(map));

        Field loadFactor2 = mapType.getDeclaredField("loadFactor");
        loadFactor2.setAccessible(true);
        System.out.println("loadFactor2 : " + loadFactor2.get(map));

    }

}
