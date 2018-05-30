package java知识.Java基础.多线程马士兵.a003;

/**
 * synchronized关键在
 * 对某个对象加锁
 * Created by GaoHangHang 2018-05-24 22:00
 **/
public class T {

    private int count = 10;

    public synchronized void m(){ //等同于在方法的代码执行是要synchronized(this)
        count--;
        System.out.println(Thread.currentThread().getName()+ " count = "+ count);
    }

}
