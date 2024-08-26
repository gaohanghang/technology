package java知识.Java基础.多线程.交替打印奇偶数.方法3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @author Gao Hanghang
 * @version 1.0
 * @description
 * @date 2024-08-23 18:55
 **/
public class Test {

    private static int n = 0;
    private static Semaphore odd = new Semaphore(1);
    private static  Semaphore even = new Semaphore(0);

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(() -> {
            for (int i = 0; i <= 100; i++) {

                if (n % 2 == 1) {
                    try {
                        odd.acquire();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("奇数" + n++);

                }
                even.release();

            }
        });

        executorService.submit(() -> {
            for (int i = 0; i <= 100; i++) {

                if (n % 2 == 0) {
                    try {
                        even.acquire();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("偶数" + n++);
                }
                odd.release();
            }
        });
    }

}
