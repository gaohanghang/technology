package java知识.公众号.Java识堂._2019.a1_13从计算机的角度理解volatile关键字;

import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2019/01/17 14:59
 */
public class Test {

    // 加上volatile关键字，线程A对data的变更，线程B立马能感知到
    /*
        1. 线程A将工作内存的data更改后，强制将data值刷会主内存
        2. 如果线程B的工作内存中有data变量的缓存时，会强制让这个data变量缓存失效
        3. 当线程B需要读取data变量的值时，先从工作内存中读，发现已经过期，就会从主内存加载data变量的最新值了
     */
    public static volatile boolean flag = false;

    public static void main(String[] args) {

        new Thread(() -> {
           while (!flag) {
           }
            System.out.println("threadB end");
        }).start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 线程A将flag的值改变，但是线程B并没有及时的感知到，导致死循环
        new Thread(() -> {
           flag = true;
            System.out.println("threadA end");
        }).start();
    }
}
