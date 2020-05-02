package java知识.公众号.骇客与画家.a2020.a3_31;

import java.util.HashMap;
import java.util.UUID;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2020-03-31 22:09
 **/
public class Test {

    public static void main(String[] args) throws InterruptedException {
        final HashMap<String, String> map = new HashMap<>(2);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            map.put(UUID.randomUUID().toString(), "");
                        }
                    }, "ftf" + i).start();
                }
            }
        }, "ftf");
        t.start();
        t.join();
    }

}
