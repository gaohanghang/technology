package java知识.知识星球.成神之路.第014期Stream相关.使用Java8Stream像操作SQL一样处理数据;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: Gao HangHang
 * @date 2018/10/08
 */
public class Test {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> twoEvenSquares = numbers.stream()
                .filter(n -> {
                    System.out.println("filtering " + n);
                    return n % 2 == 0;
                })
                .map(n -> {
                    System.out.println("mapping " + n);
                    return n * n;
                })
                .limit(2)
                .collect(Collectors.toList());
    }

}
