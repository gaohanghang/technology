package java知识.公众号.java知音.a2018_12_16JAVA多线程之线程间的通信方式.a3;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/16 19:31
 */
public class Run {
    public static void main(String[] args) {
        try {
            Object lock = new Object();

            ThreadA a = new ThreadA(lock);
            a.start();

            Thread.sleep(50);

            ThreadB b = new ThreadB(lock);
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
