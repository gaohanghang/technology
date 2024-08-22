package java知识.Java基础.多线程.三个线程交替打印ABC.方式五;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author Gao Hanghang
 * @version 1.0
 * @description
 * @date 2024-08-22 18:35
 **/
public class PrintABC {

    // 共享变量，表示当前应该打印哪个字母
    private static int state = 0;

    // 参与线程数量
    private static int threadNum = 3;

    // 循环屏障，指定三个线程为屏障点，以及一个打印字母的屏障动作
    private static final CyclicBarrier barrier = new CyclicBarrier(threadNum, new Runnable() {
        @Override
        public void run() {
            // 根据state的值判断应该打印哪个字母
            switch (state) {
                case 0:
                    System.out.println("A");
                    break;
                case 1:
                    System.out.println("B");
                    break;
                case 2:
                    System.out.println("C");
                    break;
            }
            // 修改状态
            state = (state + 1) % 3;
            System.out.println(state);
        }
    });

    public static void main(String[] args) {
        // 创建三个线程
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    // 循环100次
                    for (int i = 0; i < threadNum * 100; i++) {
                        // 执行自己的任务
                        // ...
                        // 等待其他线程到达屏障点
                        barrier.await();
                    }
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < threadNum * 100; i++) {
                        // 执行自己的任务
                        // ...
                        // 等待其他线程到达屏障点
                        barrier.await();
                    }
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread threadC = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < threadNum * 100; i++) {
                        // 执行自己的任务
                        // ...
                        // 等待其他线程到达屏障点
                        barrier.await();
                    }
                } catch (InterruptedException | BrokenBarrierException e) {
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
