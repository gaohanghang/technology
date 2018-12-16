package java知识.公众号.java知音.a2018_12_16JAVA多线程之线程间的通信方式.a2;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/16 19:11
 */
public class ThreadA extends Thread {

    private MyList list;

    public ThreadA(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                list.add();
                System.out.println("添加了" + (i + 1) + "个元素");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
