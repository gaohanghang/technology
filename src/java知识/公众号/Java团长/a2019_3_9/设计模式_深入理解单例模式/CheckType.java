package java知识.公众号.Java团长.a2019_3_9.设计模式_深入理解单例模式;


import java.util.HashMap;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2019/03/10 12:49
 */
public enum  CheckType {
    NO_PASS(0, "未通过"),
    PASS(1, "通过");

    private int key;

    private String text;

    CheckType(int key, String text) {
        this.key = key;
        this.text = text;
    }

    public int getKey() {
        return key;
    }

    public String getText() {
        return text;
    }

    private static HashMap<Integer, CheckType> map = new HashMap<>();
    static {
        for (CheckType d : CheckType.values()) {
            map.put(d.key, d);
        }
    }

    public static CheckType parse(Integer index) {
        if (map.containsKey(index)) {
            return map.get(index);
        }
        return null;
    }

}
