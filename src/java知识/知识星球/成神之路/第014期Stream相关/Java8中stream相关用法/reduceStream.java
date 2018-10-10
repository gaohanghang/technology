package java知识.知识星球.成神之路.第014期Stream相关.Java8中stream相关用法;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * 归约
 *
 * @author: Gao HangHang
 * @date 2018/10/09
 */
public class reduceStream {
    public static void main(String[] args) {
        // 获取流
        List<Book> books = Arrays.asList(
                new Book("Java编程思想", "Bruce Eckel", "机械工业出版社", 108.00D),
                new Book("Java 8实战", "Mario Fusco", "人民邮电出版社", 79.00D),
                new Book("MongoDB权威指南（第2版）", "Kristina Chodorow", "人民邮电出版社", 69.00D)
        );

        // 计算所有图书的总价
        Optional<Double> totalPrice = books.stream()
                .map(Book::getPrice)
                .reduce((n, m) -> n + m);

        // 价格最高的图书
        Optional<Book> expensive = books.stream().max(Comparator.comparing(Book::getPrice));

        // 价格最低的图书
        Optional<Book> cheapest = books.stream().min(Comparator.comparing(Book::getPrice));

        // 计算总数
        long count = books.stream().count();

    }
}
