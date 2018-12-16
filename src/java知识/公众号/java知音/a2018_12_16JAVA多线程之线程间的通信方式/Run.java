package java知识.公众号.java知音.a2018_12_16JAVA多线程之线程间的通信方式;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/16 19:04
 */
public class Run {
    public static void main(String[] args) {
        MyObject object = new MyObject();

        // 线程A与线程B 持有的是同一个对象:object
        ThreadA a = new ThreadA(object);
        ThreadB b = new ThreadB(object);
        a.start();
        b.start();
    }
}
