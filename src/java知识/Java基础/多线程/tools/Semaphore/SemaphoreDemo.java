package java知识.Java基础.多线程.tools.Semaphore;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @author Gao Hanghang
 * @version 1.0
 * @description
 * @date 2024-08-22 14:35
 **/
public class SemaphoreDemo {
    public static void main(String[] args) {
        // 创建一个 Semaphore 对象，初始值为 3，表示停车场有 3 个车位
        Semaphore semaphore = new Semaphore(3);

        // 创建 6 个线程模拟 6 辆汽车
        for (int i = 1; i <= 6; i++) {
            new Thread(() -> {
                try {
                    // 尝试抢占车位
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + "\t抢到车位");
                    try {
                        // 停留 3 秒
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "\t停留 3 秒后离开车位");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    // 释放车位
                    semaphore.release();
                }
            }, "汽车" + i).start();
        }
    }
}
