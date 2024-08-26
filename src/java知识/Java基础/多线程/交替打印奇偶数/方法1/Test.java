package java知识.Java基础.多线程.交替打印奇偶数.方法1;

/**
 * @author Gao Hanghang
 * @version 1.0
 * @description https://www.cnblogs.com/kuangtf/articles/16353365.html
 * @date 2024-08-19 18:59
 **/
public class Test {

    // 全局变量 count
    private int count = 0;

    // 锁
    private final Object lock = new Object();

    public static void main(String[] args) {
        Test test = new Test();
        test.turning();
    }

    public void turning() {
        Thread even = new Thread(() -> {
            while (count < 100) {
                // 只处理偶数
                synchronized (lock) {
                    if ((count & 1) == 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + count++);
                    }
                }
            }
        });
        Thread odd = new Thread(() -> {
            while (count < 100) {
                // 只处理偶数
                synchronized (lock) {
                    // 只处理奇数
                    if ((count & 1) == 1) {
                        System.out.println(Thread.currentThread().getName() + ": " + count++);
                    }
                }
            }
        });

        even.start();
        odd.start();

    }

}
