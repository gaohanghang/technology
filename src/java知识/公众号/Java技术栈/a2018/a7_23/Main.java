package java知识.公众号.Java技术栈.a2018.a7_23;

import edu.princeton.cs.algs4.In;

import java.nio.file.OpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author GaoHangHang
 * @date 2018/07/23 15:53
 **/
public class Main {

    public static void main(String[] args) {
        learnStream();
    }

    private static void learnStream() {
        //首先，创建一个1-6乱序的List
        List<Integer> lists = new ArrayList<>();
        lists.add(4);
        lists.add(3);
        lists.add(6);
        lists.add(1);
        lists.add(5);
        lists.add(2);

        //看看List里面的数据是什么样子的先
        System.out.println("List里面的数据：");
        for (Integer elem : lists) System.out.print(elem + " ");// 4 3 6 1 5 2

        System.out.println();

        //最小值
        System.out.println("List中最小的值为：");
        Stream<Integer> stream = lists.stream();
        Optional<Integer> min = stream.min(Integer::compareTo);
        if (min.isPresent()) {
            System.out.println(min.get());//1
        }

        //最大值
        System.out.println("List中最大的值为：");
        lists.stream().max(Integer::compareTo).ifPresent(System.out::print);

        //排序
        System.out.println("将List流进行排序：");
        Stream<Integer> sorted = lists.stream().sorted();
        sorted.forEach(elem -> System.out.print(elem + " "));

        System.out.println();

        //过滤
        System.out.println("过滤List流，只剩下那些大于3的元素：");
        lists.stream()
                .filter(elem -> elem > 3)
                .forEach(elem -> System.out.print(elem + " "));// 4 5 6
        System.out.println();

        //过滤
        System.out.println("过滤List流，只剩下那些大于0并且小于4的元素：\n====begin====");
        lists.stream()
                .filter(elem -> elem > 0)
                .filter(elem -> elem < 4)
                .sorted(Integer::compareTo)
                .forEach(System.out::println);// 1 2 3

        System.out.println("=====end=====");
        //经过了前面的这么多流操作，我们再来看看List里面的值有没有发生什么改变
        System.out.println("原List里面的数据：");
        for (Integer elem : lists) System.out.print(elem + " ");// 4 3 6 1 5 2
    }
}
