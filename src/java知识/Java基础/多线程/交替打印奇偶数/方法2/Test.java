package java知识.Java基础.多线程.交替打印奇偶数.方法2;

/**
 * @author Gao Hanghang
 * @version 1.0
 * @description
 * @date 2024-08-23 18:47
 **/
public class Test {

    private int count = 0;

    private final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Test test = new Test();
        Thread.sleep(1);
        test.turning();
    }

    public void turning() throws InterruptedException {
        new Thread(new TurningRunner(), "偶数").start();
        // 确保偶数线程线先获取到锁
        Thread.sleep(1);
        new Thread(new TurningRunner(), "奇数").start();
    }

    class TurningRunner implements Runnable{
        @Override
        public void run() {
            while (count <= 100) {
                synchronized (lock) {
                    // 拿到锁就打印
                    System.out.println(Thread.currentThread().getName() + ": " + count++);
                    // 唤醒其他线程
                    lock.notifyAll();
                    try {
                        if (count <= 100) {
                            // 如果任务还没有结束，则让出当前的锁并休眠
                            lock.wait();
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

}
