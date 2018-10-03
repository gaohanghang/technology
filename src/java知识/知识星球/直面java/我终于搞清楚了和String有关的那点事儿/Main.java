package java知识.知识星球.直面java.我终于搞清楚了和String有关的那点事儿;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Random;

/**
 * @author: Gao HangHang
 * @date 2018/10/01
 */
public class Main {

    static final int MAX = 1000 * 10000;
    static final String[] arr = new String[MAX];

    public static void main(String[] args) {
        Integer[] DB_DATA = new Integer[10];
        Random random = new Random(10 * 10000);
        for (int i = 0; i < DB_DATA.length; i++) {
            DB_DATA[i] = random.nextInt();
        }
        long t = System.currentTimeMillis();
        for (int i = 0; i < MAX; i++) {
            arr[i] = new String(String.valueOf(DB_DATA[i % DB_DATA.length])).intern();
        }

        System.out.println((System.currentTimeMillis() - t) + "ms");
        System.gc();
    }
}
