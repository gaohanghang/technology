package java知识.Java基础.多线程马士兵.a002;

/**
 *
 * Created by GaoHangHang 2018-05-24 8:41
 **/
public class T {

    private int count = 10;

    public void  m(){
        synchronized (this){ //任何线程要执行下面的代码，必须先拿到this的锁
            count--;
            System.out.println(Thread.currentThread().getName()+"count = " +count);
        }
    }

}
