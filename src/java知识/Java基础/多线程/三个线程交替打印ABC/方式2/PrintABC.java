package java知识.Java基础.多线程.三个线程交替打印ABC.方式2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Gao Hanghang
 * @version 1.0
 * @description 使用ReentrantLock和Condition
 * @date 2024-08-22 18:07
 **/
public class PrintABC {

    // 共享变量，表示当前应该打印哪个字母
    private static int state = 0;

    // 可重入锁
    private static final ReentrantLock lock = new ReentrantLock();

    // 三个条件对象，分别绑定A、B、C三个线程
    private static final Condition A = lock.newCondition();
    private static final Condition B = lock.newCondition();
    private static final Condition C = lock.newCondition();

    public static void main(String[] args) {
        // 创建三个线程
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    // 循环100次
                    for (int i = 0; i < 100; i++) {
                        // 获取锁
                        lock.lock();
                        try{
                            // 判断是否轮到自己执行
                            while (state % 3 != 0) {
                                A.await();;
                            }
                            // 打印字母
                            System.out.println("A");
                            // 修改状态
                            state++;
                            // 唤醒下一个线程
                            B.signal();
                        } finally {
                            // 释放锁
                            lock.unlock();
                        }
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        // 创建三个线程
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    // 循环100次
                    for (int i = 0; i < 100; i++) {
                        // 获取锁
                        lock.lock();
                        try{
                            // 判断是否轮到自己执行
                            while (state % 3 != 1) {
                                B.await();;
                            }
                            // 打印字母
                            System.out.println("B");
                            // 修改状态
                            state++;
                            // 唤醒下一个线程
                            C.signal();
                        } finally {
                            // 释放锁
                            lock.unlock();
                        }
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });


        // 创建三个线程
        Thread threadC = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    // 循环100次
                    for (int i = 0; i < 100; i++) {
                        // 获取锁
                        lock.lock();
                        try{
                            // 判断是否轮到自己执行
                            while (state % 3 != 2) {
                                C.await();;
                            }
                            // 打印字母
                            System.out.println("C");
                            // 修改状态
                            state++;
                            // 唤醒下一个线程
                            A.signal();
                        } finally {
                            // 释放锁
                            lock.unlock();
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
