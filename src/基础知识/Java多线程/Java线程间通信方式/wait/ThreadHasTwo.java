package 基础知识.Java多线程.Java线程间通信方式.wait;

/**
 * @author Gao Hanghang
 * @version 1.0
 * @description
 * @date 2025-01-07 20:05
 **/
public class ThreadHasTwo {

    public static final Object object1 = new Object();
    public static final Object object2 = new Object();

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            synchronized (object1) {
                System.out.println(Thread.currentThread().getName() + "获得了 object1 锁");
                try {
                    System.out.println(Thread.currentThread().getName() + "释放 object1 的锁");
                    object1.wait();
                    synchronized (object2) {
                        System.out.println(Thread.currentThread().getName() + "获得了 object2 的锁");
                        //System.out.println(Thread.currentThread().getName() + "释放 object1 的锁");
                        //object1.wait();
                        System.out.println("程序结束");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        Thread.sleep(200);

        new Thread(() -> {
            synchronized (object1) {
                System.out.println(Thread.currentThread().getName() + "获得了 object1 锁");
                object1.notify();
                synchronized (object2) {
                    System.out.println(Thread.currentThread().getName() + "获得了 object2 锁");
                }
            }
        }).start();
    }
}
