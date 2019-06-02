package java小例子.a3_自己实现个线程池;

import java小例子.a3_自己实现个线程池.communication.Notify;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-05-26 19:52
 **/
public class CustomThreadPool {

    /**
     *
     * @param miniSize 最小线程数
     * @param maxSize 最大线程数
     * @param keepAliveTime 线程保活时间
     * @param unit
     * @param workQueue 阻塞队列
     * @param notify 通知接口
     */
    public CustomThreadPool(int miniSize, int maxSize, long keepAliveTime,
                            TimeUnit unit, BlockingDeque<Runnable> workQueue, Notify notify) {

    }

    /**
     * 执行任务
     * @param runnable 需要执行的任务
     */
    public void execute(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("runnable nullPointerException");
        }

    }

    /**
     * 内部存放工作线程容器，并发安全。
     * @param <T>
     */
    private final class ConcurrentHashSet<T> extends AbstractSet<T> {

        private ConcurrentHashMap<T, Object> map = new ConcurrentHashMap<>();
        private final Object PRESENT = new Object(); // final变量：初始化一次后值不可变

        private AtomicInteger count = new AtomicInteger();

        @Override
        public Iterator<T> iterator() {
            return map.keySet().iterator();
        }

        @Override
        public boolean add(T t) {
            count.incrementAndGet();
            return map.put(t, PRESENT) == null;
        }

        @Override
        public boolean remove(Object o) {
            count.decrementAndGet();
            return map.remove(o) == PRESENT;
        }

        @Override
        public int size() {
            return count.get();
        }
    }


}
