package java知识.知识星球.成神之路.第014期Stream相关.使用Java8Stream像操作SQL一样处理数据;

import java.util.Arrays;
import java.util.List;

/**
 * sum求总和
 *
 * @author: Gao HangHang
 * @date 2018/10/08
 */
public class ReduceTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        //int           sum     = 0;
        //for (int x : numbers) {
        //    sum += x;
        //}

        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        int sum1 = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum1);

    }
}
