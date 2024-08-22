package java知识.Java基础.多线程.三个线程交替打印ABC.方式1;

/**
 * @author Gao Hanghang
 * @version 1.0
 * @description 方法一：使用synchronized和wait/notify
 * @date 2024-08-22 18:02
 **/
public class PrintABC {

    // 共享变量，表示当前应该打印哪个字母
    private static int state = 0;

    // 共享对象，作为锁和通信的媒介
    private static final Object lock = new Object();

    public static void main(String[] args) {
        // 创建三个线程
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 100; i++) {
                        synchronized (lock) {
                            // 判断是否轮到自己执行
                            while (state % 3 != 0) {
                                // 不是则等待
                                lock.wait();
                            }
                            System.out.println("A");
                            // 修改状态
                            state++;
                            // 唤醒下一个线程
                            lock.notifyAll();
                        }
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 100; i++) {
                        synchronized (lock) {
                            // 判断是否轮到自己执行
                            while (state % 3 != 1) {
                                // 不是则等待
                                lock.wait();
                            }
                            System.out.println("B");
                            // 修改状态
                            state++;
                            // 唤醒下一个线程
                            lock.notifyAll();
                        }
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread threadC = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 100; i++) {
                        synchronized (lock) {
                            // 判断是否轮到自己执行
                            while (state % 3 != 2) {
                                // 不是则等待
                                lock.wait();
                            }
                            System.out.println("C");
                            // 修改状态
                            state++;
                            // 唤醒下一个线程
                            lock.notifyAll();
                        }
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        // 启动三个线程
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
