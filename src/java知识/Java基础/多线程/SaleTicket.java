package java知识.Java基础.多线程;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author GaoHangHang
 * @date 2018/06/19 21:51
 **/
public class SaleTicket {
    public static void main(String[] args) {
        //创建线程池对象 指定核心要素 核心线程数和最大线程数一致，固定线程池大小
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5,5,1,TimeUnit.DAYS,new ArrayBlockingQueue<Runnable>(3));
        //向线程池中加入买票的任务
        executor.execute(new SaleTask());
        executor.execute(new SaleTask());
        executor.execute(new SaleTask());
        executor.execute(new SaleTask());
        executor.execute(new SaleTask());
    }
}
/**
 * 买票任务
 */
class SaleTask implements Runnable {
    //指定票的总数
    private static int ticketCount = 100;

    @Override
    public void run() {
        //当有余票时卖出票
        while (ticketCount > 0) {
            synchronized (SaleTask.class) {
                //打印对应线程卖出票
                if(ticketCount>0){
                    System.out.println("线程id【"+Thread.currentThread().getId()+"】卖出票:"+ticketCount);
                    ticketCount--;
                }
            }
        }
    }
}
