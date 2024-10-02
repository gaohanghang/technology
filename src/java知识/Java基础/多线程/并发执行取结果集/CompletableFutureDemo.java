package java知识.Java基础.多线程.并发执行取结果集;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Gao Hanghang
 * @version 1.0
 * @description 多线程并发任务,取结果归集
 * @date 2024-10-02 19:20
 **/
public class CompletableFutureDemo {

    public static void main(String[] args) {
        Long start = System.currentTimeMillis();
        //结果集
        List<String> list = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        //定长10线程池
        ExecutorService exs = Executors.newFixedThreadPool(10);
        List<CompletableFuture<String>> futureList = new ArrayList<>();
        final List<Integer> taskList = Arrays.asList(2, 1, 3, 4, 5, 6, 7, 8, 9, 10);
        try {
            ////方式一：循环创建CompletableFuture list,调用sequence()组装返回一个有返回值的CompletableFuture，返回结果get()获取
            //for(int i=0;i<taskList.size();i++){
            //    final int j=i;
            //    //异步执行
            //    CompletableFuture<String> future = CompletableFuture.supplyAsync(()->calc(taskList.get(j)), exs)
            //        //Integer转换字符串    thenAccept只接受不返回不影响结果
            //        .thenApply(e->Integer.toString(e))
            //        //如需获取任务完成先后顺序，此处代码即可
            //        .whenComplete((v, e) -> {
            //            System.out.println("任务"+v+"完成!result="+v+"，异常 e="+e+","+new Date());
            //            list2.add(v);
            //        })
            //        ;
            //    futureList.add(future);
            //}
            ////流式获取结果：此处是根据任务添加顺序获取的结果
            //list = sequence(futureList).get();

            //方式二：全流式处理转换成CompletableFuture[]+组装成一个无返回值CompletableFuture，join等待执行完毕。返回结果whenComplete获取
            CompletableFuture[] cfs  = taskList.stream().map(object -> CompletableFuture.supplyAsync(()->calc(object), exs)
                    .thenApply(h -> Integer.toString(h))
                    .whenComplete((v, e) -> {
                                        System.out.println("任务"+v+"完成!result="+v+"，异常 e="+e+","+new Date());
                                        list2.add(v);
                    })).toArray(CompletableFuture[]::new);
            //等待总任务完成，但是封装后无返回值，必须自己whenComplete()获取
            CompletableFuture.allOf(cfs).join();
            System.out.println("任务完成先后顺序，结果list2="+list2+"；任务提交顺序，结果list="+list+",耗时="+(System.currentTimeMillis()-start));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            exs.shutdown();
        }
    }

    public static Integer calc(Integer i) {
        try {
            if (i == 1) {
                //任务1耗时3秒
                Thread.sleep(3000);
            } else if (i == 5) {
                //任务5耗时5秒
                Thread.sleep(5000);
            } else {
                //其它任务耗时1秒
                Thread.sleep(1000);
            }
            System.out.println("task线程："+Thread.currentThread().getName()+"任务i="+i+",完成！+"+new Date());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    public static <T>CompletableFuture<List<T>> sequence(List<CompletableFuture<T>> futures) {
        //1.构造一个空CompletableFuture，子任务数为入参任务list size
        CompletableFuture<Void> allDoneFuture = CompletableFuture.allOf(futures.toArray(new CompletableFuture[futures.size()]));
        //2.流式（总任务完成后，每个子任务join取结果，后转换为list）
        return allDoneFuture.thenApply(v -> futures.stream().map(CompletableFuture::join).collect(Collectors.toList()));
    }

    /**
     * Stream流式类型futures转换成一个CompletableFuture,所有子任务全部完成，组合后的任务才会完成。带返回值，可直接get.
     * @param futures
     * @return
     * @param <T>
     */
    public static <T> CompletableFuture<List<T>> sequence(Stream<CompletableFuture<T>> futures) {
        List<CompletableFuture<T>> futureList = futures.filter(f -> f != null).collect(Collectors.toList());
        return sequence(futureList);
    }
}
