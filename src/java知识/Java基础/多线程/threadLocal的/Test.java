package java知识.Java基础.多线程.threadLocal的;

import java.util.concurrent.CountDownLatch;

/**
 * @author Gao Hanghang
 * @version 1.0
 * @description
 * @date 2024-07-08 18:51
 **/
public class Test {

    public static void main(String[] args) throws InterruptedException {

        // 设置初始数值为10
        CountDownLatch latch = new CountDownLatch(10);

        // 循环中调用countDown()减1，如果调用9次则数值为1，主线程和子线程都会阻塞，改为i<10调用10次则主线程和子线程都可以运行
        for(int i=0;i<9;i++) {
            latch.countDown();
            System.out.println(latch.getCount());
        }


        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("thread start");
                try {
                    // 阻塞子线程
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("thread end");
            }
        }).start();

        // 阻塞主线程
        latch.await();
        System.out.println("main end");

    }
}
