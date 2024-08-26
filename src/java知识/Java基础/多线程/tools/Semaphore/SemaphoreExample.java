package java知识.Java基础.多线程.tools.Semaphore;

import java.util.concurrent.Semaphore;
// https://segmentfault.com/a/1190000044009229
public class SemaphoreExample {
    public static void main(String[] args) {
        // 创建一个 Semaphore 对象，初始值为 3
        Semaphore semaphore = new Semaphore(3);

        // 创建 5 个线程
        for (int i = 1; i <= 5; i++) {
            new Thread(() -> {
                try {
                    // 尝试获取许可
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + " 获取到许可");
                    // 模拟线程执行一段时间
                    Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName() + " 执行完毕");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    // 释放许可
                    semaphore.release();
                    System.out.println(Thread.currentThread().getName() + " 释放许可");
                }
            }).start();
        }
    }
}
