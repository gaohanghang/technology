package java知识.公众号.程序员小灰.协程;

import java.util.Queue;

class Producer extends Thread {
    private static final int MAX_QUEUE_SIZE = 5;
    private final Queue sharedQueue;
    public Producer(Queue sharedQueue) {
        super();
        this.sharedQueue = sharedQueue;
    }


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (sharedQueue) {
                while (sharedQueue.size() >= MAX_QUEUE_SIZE) {
                    System.out.println("队列满了，等待消费");
                    try {
                        sharedQueue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                sharedQueue.add(i);
                System.out.println("进行生产 : " + i);
                sharedQueue.notify();
            }
        }
    }
}
