package 基础知识.Java多线程.Future和FutureTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * @author Gao Hanghang
 * @version 1.0
 * @description
 * @date 2024-06-26 16:57
 **/
public class CallableTest2 {
    public static void main(String[] args) {
        //      //创建线程池
        //      ExecutorService es = Executors.newSingleThreadExecutor();
        //      //创建Callable对象任务
        //      CallableDemo calTask=new CallableDemo();
        //      //提交任务并获取执行结果
        //      Future<Integer> future =es.submit(calTask);
        //      //关闭线程池
        //      es.shutdown();

        //创建线程池
        ExecutorService es = Executors.newSingleThreadExecutor();
        //创建Callable对象任务
        CallableDemo calTask=new CallableDemo();
        //创建FutureTask
        FutureTask<Integer> futureTask=new FutureTask<>(calTask);
        //执行任务
        es.submit(futureTask);
        //关闭线程池
        es.shutdown();
        try {
            Thread.sleep(2000);
            System.out.println("主线程在执行其他任务");

            if(futureTask.get()!=null){
                //输出获取到的结果
                System.out.println("futureTask.get()-->"+futureTask.get());
            }else{
                //输出获取到的结果
                System.out.println("futureTask.get()未获取到结果");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("主线程在执行完成");
    }
}
