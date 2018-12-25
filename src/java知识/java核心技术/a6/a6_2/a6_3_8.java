package java知识.java核心技术.a6.a6_2;

import java知识.java核心技术.a6.a6_2.a6_3_5.Person;
import 基础知识.Java基础.序列化.test3.People;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import static java.util.Comparator.naturalOrder;
import static java.util.Comparator.reverseOrder;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/25 18:59
 */
public class a6_3_8 {
    public static void main(String[] args) {
        Person[] people = new Person[9];
        // a comparator that compares by an extracted key
        // 将类型 T 映射为一个可比较的类型(如 String)
        Arrays.sort(people, Comparator.comparing(Person::getLastName).thenComparing(Person::getFirstName));

        Arrays.sort(people, Comparator.comparing(Person::getName, (s, t) ->  Integer.compare(s.length(), t.length())));

        Arrays.sort(people, Comparator.comparingInt(p -> p.getName().length()));

        Arrays.sort(people, Comparator.comparing(Person::getMiddleName, Comparator.nullsFirst(naturalOrder()))); // 自然顺序排序

        Arrays.sort(people, Comparator.comparing(Person::getMiddleName, Comparator.nullsFirst(reverseOrder()))); // 自然顺序的逆序
    }
}
