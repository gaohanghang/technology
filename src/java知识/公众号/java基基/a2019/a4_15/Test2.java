package java知识.公众号.java基基.a2019.a4_15;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用集合原始类型（raw type）
 */
public class Test2 {
    public static void add(List list, Object o){
        list.add(o);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        add(list, 10);
        String s = list.get(0);
    }
}
