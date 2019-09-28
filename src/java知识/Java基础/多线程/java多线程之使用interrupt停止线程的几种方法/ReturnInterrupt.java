package java知识.Java基础.多线程.java多线程之使用interrupt停止线程的几种方法;

import com.sun.deploy.net.proxy.ProxyUnavailableException;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-09-27 21:11
 **/
public class ReturnInterrupt extends Thread {

    @Override
    public void run() {
        while (true) {
            if (this.isInterrupted()) {
                System.out.println("停止了！");
                return;
            }
            System.out.println("time=" + System.currentTimeMillis());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReturnInterrupt thread = new ReturnInterrupt();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
    }
}
