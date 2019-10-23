package java知识.Java基础.多线程.WaitNotify通知机制解析;

import java.util.concurrent.TimeUnit;

/**
 * @Description https://juejin.im/entry/5a2bb783f265da43163cff74
 * @Author Gao Hang Hang
 * @Date 2019-09-28 20:02
 **/
public class ThreadTest {

    static final Object obj = false; // 对象锁

    private static boolean flag = false;

    public static void main(String[] args) throws InterruptedException {

        Thread consume = new Thread(new Consume(), "Consume");
        Thread produce = new Thread(new Produce(), "Produce");
        consume.start();
        Thread.sleep(1000);
        produce.start();

        try{
            produce.join();
            consume.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // 生产者线程
    static class Produce implements Runnable {
        @Override
        public void run() {

            synchronized (obj) {
                System.out.println("进入生产者线程");
                System.out.println("生产");
                try {
                    TimeUnit.MILLISECONDS.sleep(2000);  //模拟生产过程
                    flag = true;
                    obj.notify();  //通知消费者
                    TimeUnit.MILLISECONDS.sleep(1000);  //模拟其他耗时操作
                    System.out.println("退出生产者线程");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // 消费者线程
    static class Consume implements Runnable {

        @Override
        public void run() {
            synchronized (obj) {
                System.out.println("进入消费者线程");
                System.out.println("wait flag 1:" + flag);

                while (!flag) {  //判断条件是否满足，若不满足则等待 还没生产的情况
                    try {
                        System.out.println("还没生产，进入等待");
                        obj.wait();
                        System.out.println("结束等待");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("wait flag 2:" + flag);
                System.out.println("消费");
                System.out.println("退出消费者线程");
            }
        }
    }
}
