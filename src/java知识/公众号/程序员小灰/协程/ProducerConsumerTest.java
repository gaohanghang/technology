package java知识.公众号.程序员小灰.协程;


import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerTest {

    public static void main(String[] args) {
        final Queue<Integer> sharedQueue = new LinkedList<>();
        Thread producer = new Producer(sharedQueue);
        Thread consumer = new Consumer(sharedQueue);
        producer.start();
        consumer.start();
    }
}
