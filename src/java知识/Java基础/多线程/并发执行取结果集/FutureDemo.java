package java知识.Java基础.多线程.并发执行取结果集;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author denny.zhang
 * @ClassName: FutureDemo
 * @Description: Future多线程并发任务结果归集 https://www.cnblogs.com/dennyzhangdd/p/7010972.html#_label3
 * @date 2016年11月4日 下午1:50:32
 */
public class FutureDemo {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        // 开启多线程
        ExecutorService exs = Executors.newFixedThreadPool(10);
        try {
            List<Integer> list = new ArrayList<>();
            List<Future<Integer>> futureList = new ArrayList<>();
            //1.高速提交10个任务，每个任务返回一个Future入list
            for (int i = 0; i < 10; i++) {
                futureList.add(exs.submit(new CallableTask(i + 1)));
            }
            Long getResultStart = System.currentTimeMillis();
            System.out.println("结果归集开始时间=" + new Date());
            //2.结果归集，用迭代器遍历futureList,高速轮询（模拟实现了并发），任务完成就移除
            while(futureList.size() > 0) {
                Iterator<Future<Integer>> iterable = futureList.iterator();
                //遍历一遍
                while(iterable.hasNext()) {
                    Future<Integer> future = iterable.next();
                    //如果任务完成取结果，否则判断下一个任务是否完成
                    if (future.isDone() && !future.isCancelled()) {
                        //获取结果
                        Integer i = future.get();
                        System.out.println("任务i=" + i + "获取完成，移出任务队列！" + new Date());
                        list.add(i);
                        //任务完成移除任务
                        iterable.remove();
                    } else {
                        Thread.sleep(1);//避免CPU高速运转，这里休息1毫秒，CPU纳秒级别
                    }
                }
            }
            System.out.println("list=" + list);
            System.out.println("总耗时=" + (System.currentTimeMillis() - start) + ",取结果归集耗时=" + (System.currentTimeMillis() - getResultStart));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            exs.shutdown();
        }
    }

    static class CallableTask implements Callable<Integer> {
        Integer i;

        public CallableTask(Integer i) {
            super();
            this.i = i;
        }

        @Override
        public Integer call() throws Exception {
            if(i == 1) {
                Thread.sleep(3000);//任务1耗时3秒
            } else if (i == 5) {
                Thread.sleep(5000);//任务5耗时5秒
            } else {
                Thread.sleep(1000);//其它任务耗时1秒
            }
            System.out.println("task线程：" + Thread.currentThread().getName() + "任务i=" + i + ",完成！"+ new Date());
            return i;
        }
    }
}
