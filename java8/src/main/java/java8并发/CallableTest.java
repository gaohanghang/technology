package java8并发;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/17 21:07
 */
public class CallableTest {
    public static void main(String[] args) {
        Callable<Integer> task = () -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                return 123;
            } catch (InterruptedException e) {
                throw new IllegalStateException("task interrupted", e);
            }
        };
    }
}
