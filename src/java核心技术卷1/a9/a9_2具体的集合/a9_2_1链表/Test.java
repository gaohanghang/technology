package java核心技术卷1.a9.a9_2具体的集合.a9_2_1链表;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Test {
    public static void main(String[] args) {
        List<String> staff = new LinkedList<>();
        staff.add("Amy");
        staff.add("Bob");
        staff.add("Carl");
        ListIterator<String> iter = staff.listIterator();
        iter.next(); // skip past first element
        iter.add("Juliet");


        System.out.println(staff);

    }
}
