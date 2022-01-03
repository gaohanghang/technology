package java核心技术卷2.v2ch01.streams;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * @Description 1-1 从迭代到流的操作
 * @Author Gao Hang Hang
 * @Date 2019-11-27 21:25
 **/
public class CountLongWords {

    public static void main(String[] args) throws IOException {
        // Read file into string 读取文件到 String
        String contents = new String(Files.readAllBytes(
                Paths.get("/Users/gaohanghang/IdeaProjects/technology/src/java知识/java核心技术卷2/gutenberg/alice30.txt")), StandardCharsets.UTF_8);
        // Split into words; nonletters are delimiters \\PL+ 表示非字母分隔符
        List<String> words = Arrays.asList(contents.split("\\PL+"));

        long count = 0;
        for (String w : words) {
            if (w.length() > 12) count++;
        }
        System.out.println(count);

        /*
            流是用 stream 或 parallrlStream 方法创建的。filer 方法对其进行转换，而 count 方法是终止操作。
         */

        // Stream<T> filter(Predicate<> super T> P) 产生一个流，其中包含当前流中满足P的所有元素。
        count = words.stream().filter(w -> w.length() > 12).count();
        System.out.println(count);

        // long count() 产生当前流中元素的数量。这是一个终止操作。
        count = words.parallelStream().filter(w -> w.length() > 12).count();
        System.out.println(count);
    }

}
