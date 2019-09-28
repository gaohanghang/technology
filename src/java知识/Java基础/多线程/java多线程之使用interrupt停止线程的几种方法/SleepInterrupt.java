package java知识.Java基础.多线程.java多线程之使用interrupt停止线程的几种方法;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-09-27 21:03
 **/
public class SleepInterrupt extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("在沉睡中被停止！进入catch!"+this.isInterrupted());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            SleepInterrupt thread=new SleepInterrupt();
            thread.start();
            Thread.sleep(200);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }

        System.out.println("end");
    }
}
