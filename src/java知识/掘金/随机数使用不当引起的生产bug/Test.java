package java知识.掘金.随机数使用不当引起的生产bug;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/**
 * https://juejin.im/entry/5bb7499e6fb9a05d3251656e
 *
 * @author: Gao HangHang
 * @date 2018/10/09
 */
/*
    解决办法
    1. 使用数据库的自增id作为流水号，但这样会增加数据库IO开销，降低性能；
    2. 使用Redis存储流水号，每次使用时到Redis获取并加1，配合着分布式锁一同使用。同方案1一样，会增加IO开销，降低性能；
    3. 使用开源的发号器，如Snowflake等（有机会单独介绍）。
    4. 使用UUID，但UUID生成是字符串，不是数字，有些场景不一定适用。
 */
public class Test {

    // 总循环次数
    static int count = 10000;
    // 用于存放每个流水号出现的次数
    public static ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
    //CountDownLatch倒计时器，每个线程完成后，计时器减一，计时器归零后，主线程开始统计流水线出现的次数
    static CountDownLatch latch = new CountDownLatch(count);


    public static void main(String[] args) throws InterruptedException {
        //for (int i = 0; i < 10; i++) {
        //    new Thread() {
        //        @Override
        //        public void run() {
        //            System.out.println(genUuid());
        //        }
        //    }.start();
        //}

        // 开始生成流水号
        for (int i = 0; i < count; i++) {
            new Thread(() -> {
                put(genUuid());
                // 计数器减一
                latch.countDown();
            }).start();
        }
        // 等待计时器归零后，后续的代码才执行
        latch.await();
        System.out.println("all thread finished");
        int rCount = 0;
        // 找出次数大于1的流水号
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 1) {
                System.out.println(entry.getKey() + "---->" + entry.getValue());
                rCount++;
            }
        }
        System.out.println("重复的key有" + rCount + "个");
    }

    // 流水号由13位时间戳+3位随机数+固定数字“38”组成
    public static String genUuid() {
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();

        String curTime = System.currentTimeMillis() + "";

        sb.append(curTime);
        int forNum = 3;

        for (int i = 0; i < forNum; i++) {
            sb = sb.append(rand.nextInt(10));
        }
        sb.append("38");

        return sb.toString();
    }

    /**
     * 往map中存入数据，如果流水号已存在，则次数+1
     *
     * @param key
     */
    public static synchronized void put(String key) {
        if (map.get(key) != null) {
            map.put(key, map.get(key) + 1);
        } else {
            map.put(key, 1);
        }
    }
}
