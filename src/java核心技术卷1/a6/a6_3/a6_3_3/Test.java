package java核心技术卷1.a6.a6_3.a6_3_3;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/25 13:20
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("String");
        list.add(null);
        list.removeIf(Objects::isNull);
        System.out.println(list);
    }
}
