package java知识.知识星球.成神之路.第014期Stream相关.Java8中stream相关用法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

/**
 * @author: Gao HangHang
 * @date 2018/10/08
 */
public class CreateStream {
    public static void main(String[] args) {

        // # 由值创建流
        // 使用静态方法Stream.of()创建流，该方法接收一个变长参数：
        //Stream<String> stream = Stream.of("A", "B", "C", "D");

        // 也可以使用静态方法Stream.empty()创建一个空的流：
        //Stream<Stream> stream = Stream.empty();

        // # 由数组创建流
        String[] strs = {"A", "B", "C", "D"};
        Stream<String> stream = Arrays.stream(strs);
        List<String> list = new ArrayList<>();



    }
}
