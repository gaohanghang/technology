package java知识.java核心技术.a9.a9_2具体的集合.a9_2_6优先级队列;

import java.time.LocalDate;
import java.util.PriorityQueue;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-06-02 14:24
 **/
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<LocalDate> pq = new PriorityQueue<>();
        pq.add(LocalDate.of(1906, 12, 9));
        pq.add(LocalDate.of(1815, 12, 10));
        pq.add(LocalDate.of(1903, 12, 3));
        pq.add(LocalDate.of(1910, 6, 22));

        System.out.println("Iterating over elements...");
        for (LocalDate date : pq)
            System.out.println(date);
        System.out.println("Removing elements...");
        while (!pq.isEmpty())
            System.out.println(pq.remove());
    }
}
