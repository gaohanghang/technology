package 基础知识.Java基础.volatileTest;

import java.util.concurrent.TimeUnit;

/**
 * 什么是volatile?
 * volatile关键字是作为变量的修饰符存在的，它的存在目的是给线程同步提供了除了锁以外的另一种方式。
 *
 * 为什么要使用volatile?
 * 在某些情景下使用volatile关键词去做线程同步在效率是确实要优于锁，并且在某
 * 情景下我们为了避免程序重新排序导致线程读取值得不一致问题，此时也可以使用volatile。
 *
 * volatile的实际应用场景
 *
 *
 * @description 测试用例1：在线程中存在标识符，如何通过线程对象改变标识位
 * @author GaoHangHang
 * @date 2018/07/13 14:10
 **/
public class Demand01 {
    public static void main(String[] args) {
        ChangeFlag ch = new ChangeFlag();
        ch.start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ch.flag = false;
    }
}
class ChangeFlag extends Thread {
    boolean flag = true;
    @Override
    public void run() {
        System.out.println("准备改变标识。。。");
        while (flag){
            System.out.println("dddddddd");
        }
        System.out.println("已经改变标识。。。");
    }
}
