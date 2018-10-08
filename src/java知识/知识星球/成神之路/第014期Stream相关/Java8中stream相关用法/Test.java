package java知识.知识星球.成神之路.第014期Stream相关.Java8中stream相关用法;

import java.util.Arrays;
import java.util.List;

/**
 * @author: Gao HangHang
 * @date 2018/10/08
 */
public class Test {
    public static void main(String[] args) {
        // 外部迭代
        List<String> list = Arrays.asList("A", "B", "C", "D");
        for (String str : list) {
            System.out.println(str);
        }

        // 内部迭代
        list.stream().forEach(System.out::println);
    }
}
