package java知识.Java基础.多线程.写一段死锁的代码;

/**
 * @author Gao Hanghang
 * @version 1.0
 * @description
 * @date 2024-08-28 18:08
 **/
public class DeadlockExample {

    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Task1());
        Thread thread2 = new Thread(new Task2());

        thread1.start();
        thread2.start();
    }

    private static class Task1 implements Runnable{
        @Override
        public void run() {
            synchronized (lock1) {
                System.out.println("Task1 acquired lock1");
                // Adding some delay to increase the likelihood of deadlock
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (lock2) {
                    System.out.println("Task1 acquired lock2");
                }
            }
        }
    }

    private static class Task2 implements Runnable{
        @Override
        public void run() {
            synchronized (lock2) {
                System.out.println("Task1 acquired lock2");
                // Adding some delay to increase the likelihood of deadlock
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (lock1) {
                    System.out.println("Task1 acquired lock1");
                }
            }
        }
    }

}
