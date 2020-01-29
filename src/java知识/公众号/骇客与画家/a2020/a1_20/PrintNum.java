package java知识.公众号.骇客与画家.a2020.a1_20;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2020-01-20 19:49
 **/
public class PrintNum implements Runnable {

    int num = 1;

    @Override
    public void run() {

        synchronized (this) {
            while (true) {
                //唤醒wait()的一个或者所有线程
                notify();
                if (num <= 100) {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + num);
                    num++;
                } else {
                    break;
                }

                try {
                    wait();
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
