package java知识.公众号.Hollis.a4_27;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Boolean> map = new HashMap<>();
        Boolean b = map != null ? map.get("test") : false;
        System.out.println(b);
    }
}
