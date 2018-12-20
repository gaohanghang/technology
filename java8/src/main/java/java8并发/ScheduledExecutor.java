package java8并发;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/20 09:06
 */
public class ScheduledExecutor {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        Runnable task = () -> System.out.println("Scheduling: " + System.nanoTime());
        ScheduledFuture<?> future = executor.schedule(task, 3, TimeUnit.SECONDS);

        TimeUnit.MICROSECONDS.sleep(1337);

        long remainingDelay = future.getDelay(TimeUnit.MICROSECONDS);
        System.out.printf("Remaining Delay: %sms", remainingDelay);
    }
}
