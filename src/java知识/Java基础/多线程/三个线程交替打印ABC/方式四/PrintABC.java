package java知识.Java基础.多线程.三个线程交替打印ABC.方式四;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Gao Hanghang
 * @version 1.0
 * @description 方法四：使用AtomicInteger和CAS
 * @date 2024-08-22 18:26
 **/
public class PrintABC {

    // 共享变量，表示当前应该打印哪个字母
    private static AtomicInteger state = new AtomicInteger(0);

    public static void main(String[] args) {
        // 创建三个线程
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                // 循环100次
                for (int i = 0; i < 100; ) {
                    // 判断是否轮到自己执行
                    if (state.get() % 3 == 0) {
                        // 打印字母
                        System.out.println("A");
                        // 修改状态，使用CAS操作保证原子性
                        state.compareAndSet(state.get(), state.get() + 1);
                        // 计数器加1
                        i++;
                    }
                }
            }
        });

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; ) {
                    if (state.get() % 3 == 1) {
                        System.out.println("B");
                        state.compareAndSet(state.get(), state.get() + 1);
                        i++;
                    }
                }
            }
        });

        Thread threadC = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; ) {
                    if (state.get() % 3 == 2) {
                        System.out.println("C");
                        state.compareAndSet(state.get(), state.get() + 1);
                        i++;
                    }
                }
            }
        });

        // 启动三个线程
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
