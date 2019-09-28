package java知识.Java基础.多线程.java多线程之使用interrupt停止线程的几种方法;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-09-27 21:06
 **/
public class SleepInterrupt2 extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 100000; i++) {
                System.out.println("i=" + (i + 1));
            }
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("先停止,再遇到了sleep!进入catch!");
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        SleepInterrupt2 thread = new SleepInterrupt2();
        thread.start();
        thread.interrupt();
        System.out.println("end");

    }

}
