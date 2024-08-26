package java知识.Java基础.多线程.主进程需要等待多个子进程结束之后再执行;

import java.util.concurrent.CountDownLatch;

/**
 * @author Gao Hanghang
 * @version 1.0
 * @description
 * @date 2024-08-26 16:38
 **/
public class Test2 {

    public static void main(String[] args) throws InterruptedException {
        //创建CountDownLatch并初始化为5
        CountDownLatch latch = new CountDownLatch(5);
        for (int i = 0; i < 5; i++) {
            Thread childThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("子线程开始执行");
                    //计数器递减,为0时释放所有线程
                    latch.countDown();
                }
            });
            childThread.start();
        }
        // 设置主线程等待
        latch.await();;
        System.out.println("主线程执行");
    }

}
