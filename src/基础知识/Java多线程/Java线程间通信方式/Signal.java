package 基础知识.Java多线程.Java线程间通信方式;

/**
 * @author Gao Hanghang
 * @version 1.0
 * @description
 * @date 2024-05-10 15:19
 **/
public class Signal {
    private static volatile int signal = 0;


    static class ThreadA implements Runnable {
        @Override
        public void run() {
            while (signal < 5) {
                if ((signal % 2) == 0) {
                    System.out.println("threadA: " + signal);
                    synchronized (this) {
                        signal++;
                    }
                }
            }
        }
    }

    static class ThreadB implements Runnable {
        @Override
        public void run() {
            while (signal < 5) {
                if ((signal % 2) == 1) {
                    System.out.println("threadB: " + signal);
                    synchronized (this) {
                        signal++;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new Thread(new ThreadA()).start();
        Thread.sleep(1000);
        new Thread(new ThreadB()).start();
    }
}
