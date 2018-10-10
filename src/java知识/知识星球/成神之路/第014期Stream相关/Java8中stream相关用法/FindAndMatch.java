package java知识.知识星球.成神之路.第014期Stream相关.Java8中stream相关用法;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author: Gao HangHang
 * @date 2018/10/09
 */
public class FindAndMatch {

    public static void main(String[] args) {
        // 检查流中的任意元素是否包含字符串"Java"
        boolean hasMatch = Stream.of("Java", "C#", "PHP", "C++", "Python")
                .anyMatch(s -> s.equals("Java"));

        // 检查流中的所有元素是否都包含字符串"#"
        boolean hasAllMatch = Stream.of("Java", "C#", "PHP", "C++", "Python")
                .allMatch(s -> s.contains("#"));

        // 检查流中的任意元素是否没有"C"开头的字符串
        boolean hasNoneMatch = Stream.of("Java", "C#", "PHP", "C++", "Python")
                .noneMatch(s -> s.startsWith("C"));

        // 查找元素
        Optional<String> element = Stream.of("Java", "C#", "PHP", "C++", "Python")
                .filter(s -> s.contains("C"))
                //.findFirst()    // 查找第一个元素
                .findAny();     // 查找任意元素
    }

}
