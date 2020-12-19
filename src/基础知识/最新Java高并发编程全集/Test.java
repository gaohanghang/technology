package 基础知识.最新Java高并发编程全集;

import java.util.concurrent.locks.ReentrantLock;

public class Test {
    static ReentrantLock reentrantLock = new ReentrantLock();
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                testSync();
            }
        };
        t1.setName("t1");

        Thread t2 = new Thread() {
            @Override
            public void run() {
                testSync();
            }
        };
        t2.setName("t2");

        t1.start();
        t2.start();
    }

    public static void testSync() {
        reentrantLock.lock();
        System.out.println(Thread.currentThread().getName());
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }
    }
}
