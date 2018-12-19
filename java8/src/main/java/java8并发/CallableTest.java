package java8并发;

import java.util.concurrent.*;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/17 21:07
 */
public class CallableTest {
    public static void main(String[] args) throws Exception {
        Callable<Integer> task = () -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                return 123;
            } catch (InterruptedException e) {
                throw new IllegalStateException("task interrupted", e);
            }
        };

        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<Integer> future = executor.submit(task);

        System.out.println("future done? " + future.isDone());

        Integer result = future.get(1, TimeUnit.SECONDS);

        System.out.println("future done? " + future.isDone());
        System.out.println("result: " + result);

        executor.shutdownNow();
        future.get();
    }
}
