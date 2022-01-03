package java核心技术卷1.a8.a8_5;

/**
 * @Description: 类型擦除
 * @author: Gao Hang Hang
 * @date _2019/01/08 17:49
 */
public class Pair {
    private Object first;
    private Object second;

    public Pair(Object first, Object second) {
        this.first = first;
        this.second = second;
    }

    public Object getFirst() {
        return first;
    }

    public void setFirst(Object first) {
        this.first = first;
    }

    public Object getSecond() {
        return second;
    }

    public void setSecond(Object second) {
        this.second = second;
    }
}
