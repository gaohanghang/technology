package 基础知识.Java多线程.a先简单说一说Java中的CopyOnWriteArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2021-07-22 21:33
 **/
public class IteratorTest2 {

    private static List<String> list = new ArrayList<>();

    public static void main(String[] args) {

        list.add("1");
        list.add("2");
        list.add("3");

        Iterator<String> iter = list.iterator();

        // 存放10个线程的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);

        // 执行10个任务(我当前正在迭代集合（这里模拟并发中读取某一list的场景）)
        for (int i = 0; i < 10; i++) {
            service.execute(new Runnable() {
                @Override
                public void run() {
                    while (iter.hasNext()) {
                        System.err.println(iter.next());
                    }
                }
            });
        }

        // 执行10个任务
        for (int i = 0; i < 10; i++) {
            service.execute(new Runnable() {
                @Override
                public void run() {
                    list.add("121");// 添加数据
                }
            });
        }

        System.err.println(Arrays.toString(list.toArray()));

    }

}
