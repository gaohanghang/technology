package 基础知识.Java基础.ThreadLocal.子线程用不了父线程的threadlocal怎么办;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Gao Hanghang
 * @version 1.0
 * @description https://juejin.cn/post/7405771885327843380
 * @date 2025-02-09 18:41
 **/
public class InheritableThreadLocalSolution {
    // 使用 ThreadLocal 存储当前线程的用户名
    private static final ThreadLocal<String> userNameThreadLocal = new ThreadLocal<>();
    // 使用 InheritableThreadLocal 存储当前线程的用户名，以便子线程可以继承
    private static final InheritableThreadLocal<String> inheritableUserNameThreadLocal = new InheritableThreadLocal<>();

    public static void main(String[] args) {
        // 设置父线程的 ThreadLocal 值
        userNameThreadLocal.set("Parent Thread");
        inheritableUserNameThreadLocal.set("Parent Thread (Inheritable)");

        // 创建子线程并启动
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() -> {
            // 尝试从子线程中获取父线程的 ThreadLocal 值（通常获取不到）
            System.out.println("From child thread (ThreadLocal): " + userNameThreadLocal.get());
            // 尝试从子线程中获取父线程的 InheritableThreadLocal 值
            System.out.println("From child thread (InheritableThreadLocal): " + inheritableUserNameThreadLocal.get());
        });
        executorService.shutdown();
    }
}
