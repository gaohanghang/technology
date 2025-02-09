package 基础知识.Java基础.ThreadLocal.子线程用不了父线程的threadlocal怎么办;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Gao Hanghang
 * @version 1.0
 * @description https://juejin.cn/post/7405771885327843380
 * @date 2025-02-09 18:38
 **/
public class ManualTransferSolution {
    private static final ThreadLocal<String> valueThreadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        valueThreadLocal.set("Parent Value");
        String parentValue = valueThreadLocal.get();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() -> {
            // 在子线程中设置从父线程获取的值
            ThreadLocal<String> childThreadLocal = new ThreadLocal<>();
            childThreadLocal.set(parentValue);
            System.out.println("Child Thread Value: " + childThreadLocal.get());
        });
        executorService.shutdown();
    }
}
