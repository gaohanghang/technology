package java知识.Java基础.多线程.主进程需要等待多个子进程结束之后再执行;

import java.util.Vector;

/**
 * @author Gao Hanghang
 * @version 1.0
 * @description
 * @date 2024-08-26 16:35
 **/
public class Test {

    public static void main(String[] args) throws InterruptedException {
        Vector<Thread> vector = new Vector<>();
        for (int i = 0; i < 5; i++) {
            Thread childThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("子线程执行");
                }
            });
            vector.add(childThread);
            childThread.start();
        }
        for (Thread thread : vector) {
            // void join()  等待该线程终止
            thread.join();
        }
        System.out.println("主线程执行");
    }

}
