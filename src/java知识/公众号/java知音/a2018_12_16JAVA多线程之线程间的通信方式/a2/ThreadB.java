package java知识.公众号.java知音.a2018_12_16JAVA多线程之线程间的通信方式.a2;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/16 19:16
 */
public class ThreadB extends Thread {

    private MyList list;

    public ThreadB(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (list.size() == 5) {
                    System.out.println("==5，线程b准备退出了");
                    throw new InterruptedException();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
