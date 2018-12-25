package java知识.知识星球.成神之路.第014期Stream相关.Java8中stream相关用法;

import org.apache.jasper.tagplugins.jstl.core.If;

import java.util.*;

import static java.util.stream.Collectors.*;


/**
 * @author: Gao HangHang
 * @date 2018/10/09
 */
public class GroupByStream {
    public static void main(String[] args) {
        // 获取流
        List<Book> books = Arrays.asList(
                new Book("Java编程思想", "Bruce Eckel", "机械工业出版社", 108.00D),
                new Book("Java 8实战", "Mario Fusco", "人民邮电出版社", 79.00D),
                new Book("MongoDB权威指南（第2版）", "Kristina Chodorow", "人民邮电出版社", 69.00D)
        );

        //Map<String, List<Book>> booksGroup = books.stream().collect(groupingBy(Book::getPublisher));

        //Map<String, List<Book>> booksGroup = books
        //                        .stream()
        //                        .collect(groupingBy(book -> {
        //                            if (book.getPrice() > 0 && book.getPrice()< 50) {
        //                                return "A";
        //                            } else if (book.getPrice() > 50 && book.getPrice() < 100) {
        //                                return "B";
        //                            } else {
        //                                return "C";
        //                            }
        //                        }));

        Map<String, Map<String, List<Book>>> booksGroup = books.stream().collect(
                groupingBy(Book::getPublisher, groupingBy(book -> {
                    if (book.getPrice() > 0 && book.getPrice() < 50) {
                        return "A";
                    } else if (book.getPrice() > 50 && book.getPrice() <= 100) {
                        return "B";
                    } else {
                        return "C";
                    }
                }))
        );

        // 先分组，再统计数量
        Map<String, Long> countGroup = books.stream()
                .collect(groupingBy(Book::getPublisher, counting()));

        // 分组后获取每组中价格最高的图书：
        Map<String, Book> expensiveGroup = books.stream()
                .collect(groupingBy(Book::getPublisher, collectingAndThen(
                        maxBy(Comparator.comparing(Book::getPrice)),
                        Optional::get
                )));
    }
}
