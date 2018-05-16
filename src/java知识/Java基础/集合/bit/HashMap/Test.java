package java知识.Java基础.集合.bit.HashMap;

/**
 * Created by GaoHangHang 2018-05-16 14:19
 **/
public class Test {

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        Long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            map.put("悟空"+i,"真帅"+i);
        }
        String name = null;
        for (int i = 0; i < 1000; i++) {
            System.out.println(map.get("悟空"+i));
            name = map.get("悟空"+i);
        }
        Long end = System.currentTimeMillis();

        System.out.println("悟空老师"+name+"，消耗时间："+(end-start));
    }
}
