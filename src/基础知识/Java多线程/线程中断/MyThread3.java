package 基础知识.Java多线程.线程中断;

/**
 * 处于sleep()阻塞中的线程如果被中断就会抛出InterruptedException异常，此时它会清除中断标记，所以需要捕获该异常，并在异常处理中再次设置中断标记。
 */
public class MyThread3 extends Thread{

    @Override
    public void run() {
        while (!isInterrupted()){
            try {
                Thread.sleep(10000);
            }catch (InterruptedException ex){
                //重新设置中断标记
                interrupt();
            }
            System.out.println("do something...");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread3 myThread3 = new MyThread3();
        myThread3.start();
        Thread.sleep(3000);
        myThread3.interrupt();
    }
}
