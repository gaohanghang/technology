package java知识.公众号.Java识堂._2019.a1_13从计算机的角度理解volatile关键字;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2019/01/17 15:19
 */
public class Test2 {

    private static volatile int inc = 0;

    public static void main(String[] args) {

        // 新建一个线程池
        ExecutorService service = Executors.newCachedThreadPool();
        // java8 lambda表达式执行runable接口
        for (int i = 0; i < 5; i++) {
            service.execute(() -> {
                for (int j = 0; j < 1000; j++) {
                    inc++;
                }
            });
        }

        // 关闭线程池
        service.shutdown();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("inc= " + inc);
    }
}
