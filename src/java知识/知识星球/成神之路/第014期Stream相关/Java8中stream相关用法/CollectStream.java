package java知识.知识星球.成神之路.第014期Stream相关.Java8中stream相关用法;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;


/**
 * @author: Gao HangHang
 * @date 2018/10/09
 */
public class CollectStream {
    public static void main(String[] args) {
        // 获取流
        List<Book> books = Arrays.asList(
                new Book("Java编程思想", "Bruce Eckel", "机械工业出版社", 108.00D),
                new Book("Java 8实战", "Mario Fusco", "人民邮电出版社", 79.00D),
                new Book("MongoDB权威指南（第2版）", "Kristina Chodorow", "人民邮电出版社", 69.00D)
        );

        //// 求和
        //long count = books.stream().collect(counting());
        //
        //// 价格最高的图书
        //Optional<Book> expensive = books.stream().collect(maxBy(comparing(Book::getPrice)));
        //
        //// 价格最低的图书
        //Optional<Book> cheapest = books.stream().collect(minBy(comparing(Book::getPrice)));

        DoubleSummaryStatistics dss = books.stream().collect(summarizingDouble(Book::getPrice));
        double sum = dss.getSum();          // 汇总
        double average = dss.getAverage();  // 求平均数
        long count = dss.getCount();        // 计算总数
        double max = dss.getMax();          // 最大值
        double min = dss.getMin();          // 最小值

        String str = Stream.of("A", "B", "C", "D").collect(joining(","));

    }
}
