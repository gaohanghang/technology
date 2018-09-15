package main.java.chapter_04;

import java.util.ArrayList;
import java.util.List;

/**
 * 范围
 *
 * @author: Gao HangHang
 * @date 2018/09/15
 */
public class Example3 {

    private List<Integer> ageRange(int minAge, int maxAge) {
        List<Integer> list = new ArrayList<>(maxAge - minAge);
        for (int i = minAge; i < maxAge; i++) {
            list.add(i);
        }
        return list;
    }

    public void invoke() {
        List<Integer> range = ageRange(20, 35);
        System.out.println(range);
    }


}
