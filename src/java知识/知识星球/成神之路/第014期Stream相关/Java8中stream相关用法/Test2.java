package java知识.知识星球.成神之路.第014期Stream相关.Java8中stream相关用法;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author: Gao HangHang
 * @date 2018/10/08
 */
public class Test2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
        stream.forEach(System.out::println); // 这里会抛出java.lang.IllegalStateException，因为流已经被关闭
    }
}
