package java知识.公众号.Java技术栈.a2019.a7_2;

/**
 * @Description 对普通方法同步 锁是对象
 * @Author Gao Hang Hang
 * @Date 2019-07-02 23:19
 **/
public class SynchronizedTest2 {

    public synchronized void method1(){
        System.out.println("Method 1 start");
        try {
            System.out.println("Method 1 execute");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 1 end");
    }

    public synchronized void method2(){
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
        final SynchronizedTest2 test = new SynchronizedTest2();

        new Thread(test::method1).start();

        new Thread(test::method2).start();
    }

}
