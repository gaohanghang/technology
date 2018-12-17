package java8并发;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/17 09:05
 */
public class Test {
    public static void main(String[] args) {
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        };

        task.run();

        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Done!");
    }
}
