package java知识.java核心技术卷1.a6.a6_3.a6_3_8;


import java.util.Comparator;
import static java.util.Arrays.sort;
import static java.util.Comparator.naturalOrder;
import static java.util.Comparator.reverseOrder;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/25 18:59
 */
public class Test {
    public static void main(String[] args) {
        Person[] people = new Person[9];
        // a comparator that compares by an extracted key
        // 将类型 T 映射为一个可比较的类型(如 String)
        sort(people, Comparator.comparing(Person::getLastName).thenComparing(Person::getFirstName));

        sort(people, Comparator.comparing(Person::getName, (s, t) ->  Integer.compare(s.length(), t.length())));

        sort(people, Comparator.comparingInt(p -> p.getName().length()));

        sort(people, Comparator.comparing(Person::getMiddleName, Comparator.nullsFirst(naturalOrder()))); // 自然顺序排序

        sort(people, Comparator.comparing(Person::getMiddleName, Comparator.nullsFirst(reverseOrder()))); // 自然顺序的逆序
    }
}
