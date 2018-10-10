package java知识.知识星球.成神之路.第014期Stream相关.Java8中stream相关用法;

import java.util.stream.Stream;

/**
 * @author: Gao HangHang
 * @date 2018/10/09
 */
public class FilterAndSort {
    public static void main(String[] args) {
        Stream.of(1, 8, 5, 2, 1, 0, 9, 2, 0, 4, 8)
                .filter(n -> n > 2)     // 对元素过滤，保留大于2的元素
                .distinct()             // 去重，类似于SQL语句中的DISTINCT
                .skip(1)                // 跳过前面1个元素
                .limit(2)               // 返回开头2个元素，类似于SQL语句中的SELECT TOP
                .sorted()               // 对结果排序
                .forEach(System.out::println);
    }
}
