package java知识.Java基础.多线程马士兵.a001;

/**
 * Synchronized关键字
 * 对某个对象加锁
 * Created by GaoHangHang 2018-05-24 8:31
 **/
public class T {

    private int count = 10;
    private Object o = new Object();

    public void m() {
        synchronized (o) { //任何线程要执行下面的代码，必须先拿到o的锁
            count--;
            System.out.println(Thread.currentThread().getName() + "count = " + count);
        }
    }

}
