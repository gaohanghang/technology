package java知识.公众号.Java技术栈.a2019.a7_2;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-07-02 23:27
 **/
public class SynchronizedDemo {
    public void method() {
        synchronized (this) {
            System.out.println("Method 1 start");
        }
    }
}
