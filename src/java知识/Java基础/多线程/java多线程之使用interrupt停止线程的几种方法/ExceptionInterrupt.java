package java知识.Java基础.多线程.java多线程之使用interrupt停止线程的几种方法;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-09-27 20:57
 **/
public class ExceptionInterrupt extends Thread{

    public void run() {
        for (int i = 0; i < 500000; i++) {
            if (this.isInterrupted()) {
                System.out.println("已经是停止状态了！我要退出了！");
                break;
            }
            System.out.println("i=" + (i + 1));
        }
        System.out.println("我被输出，如果此代码是for又继续运行，线程并未停止！");
    }

    public static void main(String[] args) {
        ExceptionInterrupt thread = new ExceptionInterrupt();
        thread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
