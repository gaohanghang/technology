package java知识.公众号.java3y;

import javax.sound.midi.Soundbank;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/01 6:30 PM
 */
public class AtomicMain {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();

        Count count = new Count();
        // 100个线程对共享变量进行加1
        for (int i = 0; i < 100; i++) {
            service.execute(() -> count.increase());
        }

        // 等待上述的线程执行完
        service.shutdown();
        service.awaitTermination(1, TimeUnit.DAYS);

        System.out.println(count.getCount());
    }
}

class Count {

    // // 共享变量(使用AtomicInteger来替代Synchronized锁)
    // private Integer count = 0;
    //
    // public Integer getCount() {
    //     return count;
    // }
    //
    // public void increase() {
    //     count++;
    // }

    // 共享变量(使用AtomicInteger来替代Synchronized锁)
    private AtomicInteger count = new AtomicInteger(0);

    public AtomicInteger getCount() {
        return count;
    }

    public void increase() {
        count.incrementAndGet();
    }
}
