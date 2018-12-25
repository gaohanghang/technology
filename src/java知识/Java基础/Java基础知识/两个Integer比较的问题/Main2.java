package java知识.Java基础.Java基础知识.两个Integer比较的问题;

import java.util.HashMap;
import java.util.Map;

/**
 * @author GaoHangHang
 * @date 2018/08/20 19:19
 **/
public class Main2 {
    public static void main(String[] args) {
        Map<Integer, Integer> mapA = new HashMap<>();
        Map<Integer, Integer> mapB = new HashMap<>();
        for (int i = 0; i < 150; i++) {
            mapA.put(i, i);
            mapB.put(i, i);
        }
        for (int i = 0; i < 150; i++) {
            System.out.println(i + " " + (mapA.get(i) == (mapB.get(i))));
        }
    }
}
