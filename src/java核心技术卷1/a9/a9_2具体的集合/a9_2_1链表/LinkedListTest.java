package java核心技术卷1.a9.a9_2具体的集合.a9_2_1链表;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {
    public static void main(String[] args) {
        List<String> a = new LinkedList<>();
        a.add("Any");
        a.add("Carl");
        a.add("Erica");

        List<String> b = new LinkedList<>();
        b.add("Bod");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");

        // merge the words from b into a

        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();

        while (bIter.hasNext()) {
            if (aIter.hasNext()) aIter.next();
            aIter.add(bIter.next());
        }

        System.out.println(a);

        // remove every second word from b

        bIter = b.iterator();

        while (bIter.hasNext()) {
            bIter.next(); // skip one element
            if (bIter.hasNext()) {
                bIter.next(); // skip next element
                bIter.remove(); // remove that element
            }
        }
        System.out.println(b);
    }
}
