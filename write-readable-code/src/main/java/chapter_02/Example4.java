package main.java.chapter_02;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/09/14 下午10:24
 */
public class Example4 {

    private int hash;
    private int c = 2018;

    public void calcHash() {
        // Fast version of "hash = (65599 * hash) + c"
        hash = (hash << 6) + (hash << 16) - hash + c;
    }

}
