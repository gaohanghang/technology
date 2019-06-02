package java知识.java核心技术.a9.a9_2具体的集合.a9_2_4树集;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {
        SortedSet<Item> parts = new TreeSet<>();
        parts.add(new Item("Toaster", 1234));
        parts.add(new Item("Widget", 4562));
        parts.add(new Item("Modem", 9912));
        System.out.println(parts); // 按照部件编号排序


        NavigableSet<Item> sortByDescription = new TreeSet<>(Comparator.comparing(Item::getDescription));

        sortByDescription.addAll(parts);
        System.out.println(sortByDescription); // 按照描述信息排序
    }
}
