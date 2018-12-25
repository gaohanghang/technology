package 基础知识.Java基础.volatileTest;

import java.util.concurrent.TimeUnit;

/**
 * @author GaoHangHang
 * @description 测试用例1：多线程增加某个变量值
 * @date 2018/07/13 17:51
 **/
public class Demand02 {
    public static void main(String[] args) {
        AddCount ac = new AddCount();
        for (int i = 0; i < 4; i++) {
            new Thread(ac).start();
        }
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("4个线程执行累加1000次最后count的结果是：" + ac.count);
    }
}

class AddCount implements Runnable {
    volatile int count = 0;

    @Override
    public synchronized void run() {
        for (int i = 0; i < 1000; i++) {
            count++;
        }
    }
}