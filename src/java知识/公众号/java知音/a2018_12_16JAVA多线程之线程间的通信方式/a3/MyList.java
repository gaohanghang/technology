package java知识.公众号.java知音.a2018_12_16JAVA多线程之线程间的通信方式.a3;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/16 19:23
 */
public class MyList {

    private static List<String> list = new ArrayList<>();

    public static void add() {
        list.add("anyString");
    }

    public static int size() {
        return list.size();
    }
}
