package java知识.公众号.骇客与画家.a2020.a3_1;

import java.util.Arrays;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2020-03-01 12:19
 **/
public class StreamReduceExample {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //int sum = 0;
        //for (int i : numbers) {
        //    sum += i;
        //}
        //
        //System.out.println("sum : " + sum); // 55

        // 1st argument, init value = 0
        //int sum = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);

        int sum = Arrays.stream(numbers).reduce(0, Integer::sum); // 55

        System.out.println("sum : " + sum); // 55

        int sum2 = Arrays.stream(numbers).reduce(0, Integer::sum);      // 55

        int sum3 = Arrays.stream(numbers).reduce(0, (a, b) -> a - b);   // -55
        int sum4 = Arrays.stream(numbers).reduce(0, (a, b) -> a * b);   // 0, initial is 0, 0 * whatever = 0
        int sum5 = Arrays.stream(numbers).reduce(0, (a, b) -> a / b);   // 0

        int max = Arrays.stream(numbers).reduce(0, (a, b) -> a > b ? a : b);  // 10
        int max1 = Arrays.stream(numbers).reduce(0, Integer::max);            // 10

        int min = Arrays.stream(numbers).reduce(0, (a, b) -> a < b ? a : b);  // 0
        int min1 = Arrays.stream(numbers).reduce(0, Integer::min);            // 0

        String[] strings = {"a", "b", "c", "d", "e"};

        // |a|b|c|d|e , the initial | join is not what we want
        String reduce = Arrays.stream(strings).reduce("", (a, b) -> a + "|" + b);

        // a|b|c|d|e, filter the initial "" empty string
        String reduce2 = Arrays.stream(strings).reduce("", (a, b) -> {
            if (!"".equals(a)) {
                return a + "|" + b;
            } else {
                return b;
            }
        });

        // a|b|c|d|e , better uses the Java 8 String.join :)
        String join = String.join(",", strings);

        System.out.println(join);

    }

}
