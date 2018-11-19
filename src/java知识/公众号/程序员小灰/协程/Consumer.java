package java知识.公众号.程序员小灰.协程;


import java.util.Queue;

class Consumer extends Thread {
    private final Queue sharedQueue;

    public Consumer(Queue sharedQueue) {
        super();
        this.sharedQueue = sharedQueue;
    }
    @Override
    public void run() {
        while(true) {
            synchronized (sharedQueue) {
                while (sharedQueue.size() == 0) {
                    try {
                        System.out.println("队列空了，等待生产");
                        sharedQueue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int number = (int) sharedQueue.poll();
                System.out.println("进行消费 : " + number );
                sharedQueue.notify();
            }
        }
    }
}