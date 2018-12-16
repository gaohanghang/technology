package java知识.公众号.java知音.a2018_12_16JAVA多线程之线程间的通信方式;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/16 19:00
 */
public class ThreadA extends Thread {

    private MyObject object;

    public ThreadA(MyObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}
