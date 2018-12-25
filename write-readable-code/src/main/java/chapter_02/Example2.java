package main.java.chapter_02;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/09/14 下午9:41
 */
public class Example2 {

    private int cap = 2333;
    private double weight = 1.5;

    public double before() {
        return cap >= 0 ? weight * (1 << cap) : weight / (1 << -cap);
    }

    public double after() {

        if (cap >= 0) {
            return weight * (1 << cap);
        }
        return weight / (1 << -cap);

    }

}
