package 基础知识.Java多线程.死锁;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2021-05-03 10:51
 **/
public class DeadLock{
    private static Object resource1 = new Object();
    private static Object resource2 = new Object();

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (resource1) {
                System.out.println(Thread.currentThread() + "得到资源1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + "等待资源2");
                synchronized (resource2) {
                    System.out.println(Thread.currentThread() + "得到资源2");
                }
            }
        }, "线程 1").start();

        new Thread(() -> {
            synchronized (resource2) {
                System.out.println(Thread.currentThread() + "得到资源2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + "等待资源1");
                synchronized (resource1) {
                    System.out.println(Thread.currentThread() + "得到资源1");
                }
            }
        }, "线程 2").start();
    }
}
