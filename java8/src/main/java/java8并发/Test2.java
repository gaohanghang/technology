package java8并发;

import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/17 20:53
 */
public class Test2 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            try {
                String name = Thread.currentThread().getName();
                System.out.println("Foo " + name);
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Bar " + name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
