package 基础知识.Java多线程.线程中断;

/**
 * 主线程在3秒后更改flag状态，但是线程还处于sleep()阻塞中，需要等到sleep()时间结束也就是10秒后线程才停止。
 */
public class MyThread extends Thread{
    volatile boolean flag = true;

    @Override
    public void run() {
        while (flag){
            try {
                Thread.sleep(10000);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
            System.out.println("do something...");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(3000);
        myThread.flag = false;
    }
}
