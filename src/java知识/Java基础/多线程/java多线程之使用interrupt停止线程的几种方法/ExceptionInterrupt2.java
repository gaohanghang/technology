package java知识.Java基础.多线程.java多线程之使用interrupt停止线程的几种方法;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-09-27 21:00
 **/
public class ExceptionInterrupt2 extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 500000; i++) {
                if (this.isInterrupted()) {
                    System.out.println("已经是停止状态了！我要退出了！");
                    throw new InterruptedException();
                }
                System.out.println("i=" + (i + 1));
            }
            System.out.println("我在for下面");
        } catch (InterruptedException e) {
            System.out.println("进入ExceptionInterrupt2 类中run方法的catch了!");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExceptionInterrupt2 thread = new ExceptionInterrupt2();
        thread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
