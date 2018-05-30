package java知识.公众号.Hollis.a5_20;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by GaoHangHang 2018-05-25 21:31
 **/
public class Main {

    public static void main(String[] args) throws Exception {
        Map<String, String> map = new HashMap<String, String>();
        map.put("hollis", "hollischuang");

        //通过反射获取容量
        Class<?> mapType = map.getClass();
        Method capacity = mapType.getDeclaredMethod("capacity");
        capacity.setAccessible(true);
        System.out.println("capacity : " + capacity.invoke(map));

        //通过反射获取size
        Field size = mapType.getDeclaredField("size");
        size.setAccessible(true);
        System.out.println("size : " + size.get(map));
    }

}
