package java知识.知识星球.成神之路.第014期Stream相关.Java8中stream相关用法;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: Gao HangHang
 * @date 2018/10/09
 */
public class MapAndFlatMap {
    public static void main(String[] args) {
        List<String[]> result = Stream.of("Hello Man")
                .map(s -> s.split(""))
                .collect(Collectors.toList());

        //List<String> result = Stream.of("Hello Man")
        //        .map(s -> s.split(""))
        //        .flatMap(Arrays::stream)
        //        .collect(Collectors.toList());
    }
}
