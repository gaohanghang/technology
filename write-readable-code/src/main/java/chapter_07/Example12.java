package main.java.chapter_07;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 采用信息量高的词
 *
 * @author: Gao HangHang
 * @date 2018/09/15
 */
public class Example12 {

    /**
     * 该类充当数据库的缓存层 😓
     */
    class StoreAccounts {

        String     username;
        String     roleName;
        Integer    score;
        LocalDate  birthday;
        BigDecimal amount;
        // ...
    }

    /**
     * 规范化街道地址 （删除多余的空格，简化词组。如将"Avenue"变为"Ave"）
     */
    public void cleanStreet() {
    }

}
