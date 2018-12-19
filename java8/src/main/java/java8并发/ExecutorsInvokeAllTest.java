package java8并发;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/18 21:21
 */
public class ExecutorsInvokeAllTest {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newWorkStealingPool();

        // List<Callable<String>> callables = Arrays.asList(
        //         () -> "task1",
        //         () -> "task2",
        //         () -> "task3");
        //
        // executor.invokeAll(callables)
        //         .stream()
        //         .map(future -> {
        //             try {
        //                 return future.get();
        //             } catch (Exception e) {
        //                 throw new IllegalStateException(e);
        //             }
        //         })
        //         .forEach(System.out::println);


        test();
    }

    public static void test() throws Exception {
        ExecutorService executorService = Executors.newWorkStealingPool();

        List<Callable<String>> callabless = Arrays.asList(
                callable("task1", 2),
                callable("task2", 1),
                callable("task3", 3)
        );

        String result = executorService.invokeAny(callabless);
        System.out.println(result);

        // => task2
    }

    static Callable<String> callable(String result, long sleepSeconds) {
        return () -> {
            TimeUnit.SECONDS.sleep(sleepSeconds);
            return result;
        };
    }
}
