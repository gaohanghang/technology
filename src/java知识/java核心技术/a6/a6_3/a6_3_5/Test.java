package java知识.java核心技术.a6.a6_3.a6_3_5;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @Description: 构造器引用
 * @author: Gao Hang Hang
 * @date 2018/12/25 14:21
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Stream<Person> stream = names.stream().map(Person::new);
        // List<Person> people = stream.collect(Collectors.toList());

        Object[] objects = stream.toArray();
        Person[] people = stream.toArray(Person[]::new);
    }
}
