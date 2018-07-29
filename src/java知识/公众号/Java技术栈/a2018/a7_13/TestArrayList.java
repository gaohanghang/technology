package java知识.公众号.Java技术栈.a2018.a7_13;

import java.util.ArrayList;
import java.util.List;

/**
 * 出场率比较高的一道多线程安全面试题
 *
 * @author GaoHangHang
 * @date 2018/07/20 19:09
 **/
public class TestArrayList {

    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            testList();
            list.clear();
        }
    }

    private static void  testList() throws InterruptedException {
        Runnable runnable = () -> {
            for (int i = 0; i < 10000; i++) {
                list.add(i);
            }
        };

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println(list.size());
    }
}
