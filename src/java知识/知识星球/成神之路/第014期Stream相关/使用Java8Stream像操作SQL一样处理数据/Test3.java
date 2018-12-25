package java知识.知识星球.成神之路.第014期Stream相关.使用Java8Stream像操作SQL一样处理数据;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author: Gao HangHang
 * @date 2018/10/08
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        Stream<Integer> numbersFromValues = Stream.of(1, 2, 3, 4);
        int[] numbers = {1, 2, 3, 4};
        IntStream numbersFromArray = Arrays.stream(numbers);
        long numberOfLines = Files.lines(Paths.get("yourFile.txt"), Charset.defaultCharset())
                .count();
    }
}
