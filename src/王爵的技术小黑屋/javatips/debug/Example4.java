package 王爵的技术小黑屋.javatips.debug;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 多线程调试
 *
 * @author GaoHangHang
 * @date 2018/08/19 21:44
 **/
public class Example4 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        Runnable r1 = () -> {
            System.out.println("当前线程： " + Thread.currentThread().getName());
            System.out.println("少小离家老大回");
        };

        Runnable r2 = () -> {
            System.out.println("当前线程：" + Thread.currentThread().getName());
            System.out.println("有钱人终成眷属");
        };

        Runnable r3 = () -> {
            System.out.println("当前线程：" + Thread.currentThread().getName());
            System.out.println("问世间");
        };

        executorService.execute(r1);
        executorService.execute(r2);
        executorService.execute(r3);

        System.out.println("山外青山楼外楼");
    }
}
