package 基础知识.Java多线程.Java线程间通信方式;

/**
 * @author Gao Hanghang
 * @version 1.0
 * @description https://www.bilibili.com/video/BV1ue4y1X7MS
 * 为什么wait/notify/notifyAll定义在Object中
 * @date 2025-01-07 19:58
 **/
public class ObjectWait {

    public static final Object object = new Object();

    static class Thread1 extends Thread {
        @Override
        public void run() {
            synchronized (object) {
                System.out.println("Thread1 抢到了锁，开始执行");
                try {
                    System.out.println("Thread1 释放锁");
                    object.wait();
                    System.out.println("Thread1 再次被唤醒，开始执行");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    static class Thread2 extends Thread {
        @Override
        public void run() {
            synchronized (object) {
                System.out.println("Thread2 抢到了锁， 开始执行");
                object.notify();
                System.out.println("Thread2 通知其他线程唤醒");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        Thread.sleep(200);
        thread2.start();
    }
}
