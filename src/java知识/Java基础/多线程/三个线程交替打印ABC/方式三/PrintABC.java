package java知识.Java基础.多线程.三个线程交替打印ABC.方式三;

import java.util.concurrent.Semaphore;

/**
 * @author Gao Hanghang
 * @version 1.0
 * @description 使用Semaphore
 * @date 2024-08-22 18:21
 **/
public class PrintABC {

    private static int state = 0;

    // 三个信号量对象，分别表示A、B、C三个线程的初始许可数
    private static final Semaphore A = new Semaphore(1);
    private static final Semaphore B = new Semaphore(0);
    private static final Semaphore C = new Semaphore(0);

    public static void main(String[] args) {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 100; i++) {
                        // 获取许可
                        A.acquire();;
                        // 打印字母
                        System.out.println("A");
                        // 修改状态
                        state++;
                        // 释放许可
                        B.release();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 100; i++) {
                        // 获取许可
                        B.acquire();;
                        // 打印字母
                        System.out.println("B");
                        // 修改状态
                        state++;
                        // 释放许可
                        C.release();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread threadC = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 100; i++) {
                        // 获取许可
                        C.acquire();;
                        // 打印字母
                        System.out.println("C");
                        // 修改状态
                        state++;
                        // 释放许可
                        A.release();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // 启动三个线程
        threadA.start();
        threadB.start();
        threadC.start();
    }

}
