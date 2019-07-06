package java知识.公众号.Java技术栈.a2019.a7_2;

/**
 * @Description 静态方法（类）同步 锁是类上的锁
 * @Author Gao Hang Hang
 * @Date 2019-07-02 23:23
 **/
public class SynchronizedTest3 {

    public static synchronized void method1(){
        System.out.println("Method 1 start");
        try {
            System.out.println("Method 1 execute");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 1 end");
    }

    public static synchronized void method2(){
        System.out.println("Method 2 start");
        try {
            System.out.println("Method 2 execute");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 2 end");
    }

    public static void main(String[] args) {
        final SynchronizedTest3 test = new SynchronizedTest3();
        final SynchronizedTest3 test2 = new SynchronizedTest3();

        new Thread(SynchronizedTest3::method1).start();

        new Thread(SynchronizedTest3::method2).start();
    }
}
