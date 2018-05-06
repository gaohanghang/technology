package java知识.公众号.Java技术栈.a2017.a6_7;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 保证元素添加的顺序：LinkedHashSet
 * 保证元素自然的顺序：TreeSet
 */
public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("s1");
        set.add("s5");
        set.add("s3");
        set.add("s4");
        set.add("s2");
        set.forEach(e -> System.out.print(e + " "));
        System.out.println();

        Set<String> set2 = new LinkedHashSet<>();
        set2.add("s1");
        set2.add("s5");
        set2.add("s3");
        set2.add("s4");
        set2.add("s2");
        set2.forEach(e -> System.out.print(e + " "));
        System.out.println();

        Set<String> set3 = new TreeSet<>();
        set3.add("s1");
        set3.add("s5");
        set3.add("s3");
        set3.add("s4");
        set3.add("s2");
        set3.forEach(e -> System.out.print(e + " "));
        System.out.println();
    }
}
