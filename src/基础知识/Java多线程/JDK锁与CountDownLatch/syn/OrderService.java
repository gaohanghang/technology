package 基础知识.Java多线程.JDK锁与CountDownLatch.syn;

import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

/**
 * @Description https://www.bilibili.com/video/BV1nt411x7vt
 * @Author Gao Hang Hang
 * @Date 2021-05-02 15:13
 **/
// 使用多线程模拟生成订单号
public class OrderService implements Runnable {
    private OrderNumGenerator orderNumGenerator = new OrderNumGenerator();

    // 发令枪，模拟50个并发
    private static CountDownLatch countDownLatch = new CountDownLatch(50);

    private static List<String> result = new Vector<>();

    @Override
    public void run() {
        countDownLatch.countDown();
        result.add(orderNumGenerator.getNumber());
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println("####生成唯一订单号###");

        for (int i = 0; i < 50; i++) {
            new Thread(new OrderService()).start();
        }

        countDownLatch.await();

        Thread.sleep(1000);
        Collections.sort(result);

        for (String str : result) {
            System.out.println(str);
        }
    }

}
