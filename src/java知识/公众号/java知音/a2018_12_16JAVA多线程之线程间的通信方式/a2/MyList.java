package java知识.公众号.java知音.a2018_12_16JAVA多线程之线程间的通信方式.a2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/16 19:10
 */
public class MyList {
    private List<String> list = new ArrayList<>();
    public void add() {
        list.add("elemnets");
    }
    public int size() {
        return list.size();
    }
}
