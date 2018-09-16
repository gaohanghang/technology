package main.java.chapter_06new;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 总结性注释
 *
 * @author: Gao HangHang
 * @date 2018/09/15
 */
public class Example7 {

    private List<Long> customers = Arrays.asList(1L, 3L, 45L, 62L, 98L);
    private Map<Long,List<Sale>> allSales = new HashMap<>();

    static class Sale {

        Long recipient;
    }

    public void foo() {
        // 找到客户购买的所有商品
        for (Long customerId : customers) {
            for (Sale sale : allSales.get(customerId)) {
                if (sale.recipient.equals(customerId)) {
                    // do something
                }
            }
        }
    }

    public void generateUserReport() {
        // 获取当前用户的锁
        // .... 省略一部分代码

        // 从数据库读取用户的信息
        // .... 省略一部分代码

        // 释放当前用户的锁
    }

    // 1. 不管你心里在想什么，先把它记录下来
    // 2. 读一下这段注释，看看它有什么需要改进的
    // 3. 不断改进


}
