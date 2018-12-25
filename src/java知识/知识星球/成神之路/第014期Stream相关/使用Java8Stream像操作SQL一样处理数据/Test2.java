package java知识.知识星球.成神之路.第014期Stream相关.使用Java8Stream像操作SQL一样处理数据;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: Gao HangHang
 * @date 2018/10/08
 */
public class Test2 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Oracle", "Java", "Magazine");
        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(wordLengths);
    }

}
