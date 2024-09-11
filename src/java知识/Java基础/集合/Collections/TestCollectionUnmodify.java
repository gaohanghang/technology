package java知识.Java基础.集合.Collections;

import java.util.*;
// 怎么确保一个集合不能被修改？
public class TestCollectionUnmodify {

    static List<String> list = new ArrayList<String>();
    static Set<String> set = new HashSet<String>();
    static Map<String, String> map = new HashMap<String, String>();

    static {
        list.add("1");
        list.add("2");
        list.add("3");

        set.add("1");
        set.add("2");
        set.add("3");

        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
    }

    public static void main(String[] args) {
        list = Collections.unmodifiableList(list);
        set = Collections.unmodifiableSet(set);
        map = Collections.unmodifiableMap(map);
        listModify();
        setModify();
        mapModify();
    }

    public static void listModify() {
        list.add("4");
    }

    public static void setModify() {
        set.add("4");
    }

    public static void mapModify() {
        map.put("3", "4");
    }
}
