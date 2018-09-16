package main.java.chapter_10;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

/**
 * 减少变量
 *
 * @author: Gao HangHang
 * @date 2018/09/16
 */
public class Example1 {

    class Message {
        LocalDateTime lastViewTime;
    }

    public void part1(Message rootMessage) {
        rootMessage.lastViewTime = LocalDateTime.now();
    }

    public void part2() {
        BiConsumer<List<Integer>, Integer> consumer = (array, valueToRemove) -> {
            for (int i = 0; i < array.size(); i++) {
                if (array.get(i).equals(valueToRemove)) {
                    array.remove(i);
                    break;
                }
            }
        };
        consumer.accept(Arrays.asList(1,2,3),2);
    }

}
