package java知识.知识星球.成神之路.第014期Stream相关.Java8中stream相关用法;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

/**
 * @author: Gao HangHang
 * @date 2018/10/08
 */
public class CreateStream {
    public static void main(String[] args) throws IOException {
        // # 创建流

        // ## 由值创建流
        // 使用静态方法Stream.of()创建流，该方法接收一个变长参数：
        //Stream<String> stream = Stream.of("A", "B", "C", "D");

        // 也可以使用静态方法Stream.empty()创建一个空的流：
        //Stream<Stream> stream = Stream.empty();

        // ## 由数组创建流
        // 使用静态方法Arrays.stream()从数组创建一个流，该方法接收一个数组参数：
        //String[] strs = {"A", "B", "C", "D"};
        //Stream<String> stream = Arrays.stream(strs);

        // ## 通过文件生成流
        // 使用java.nio.file.Files类中的很多静态方法都可以获取流，比如Files.lines()方法，
        // 该方法接收一个java.nio.file.Path对象，返回一个由文件行构成的字符串流：
        //Stream<String> stream= Files.lines(Paths.get("text.txt"), Charset.defaultCharset());

        // ## 通过函数创建流
        // java.util.stream.Stream中有两个静态方法用于从函数生成流，
        // 他们分别是Stream.generate()和Stream.iterate()：

        // iteartor
        //Stream.iterate(0, n -> n + 2).limit(51).forEach(System.out::println);

        // generate
        //Stream.generate(() -> "Hello Man!").limit(10).forEach(System.out::println);

        // iterate()用于生成一系列值，比如生成以当前时间开始之后的10天的日期
        Stream.iterate(LocalDate.now(), date -> date.plusDays(1)).limit(10).forEach(System.out::println);

        // generate()方法用于生成一些随机数，比如生成10个UUID
        Stream.generate(() -> UUID.randomUUID().toString()).limit(10).forEach(System.out::println);


    }
}
