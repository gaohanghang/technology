package 牛客网.华为.a30删除字符串中出现次数最少的字符;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {

            String string = sc.nextLine();
            char[] chars = string.toCharArray();
            Map<Character, Integer> map = new LinkedHashMap<>();


            for (char c :
                    chars) {
                if (!map.containsKey(c)) {
                    map.put(c, 1);
                } else {
                    map.put(c, map.get(c) + 1);
                }
            }
            // 获取最小的次数
            Collection<Integer> allValues = map.values();
            int index = Collections.min(allValues);
            StringBuffer sb = new StringBuffer();
            // 将出现次数不是最小次数的放进StringBuffer中
            for (char c : chars) {
                if (map.get(c) != index) {
                    sb.append(c);
                }
            }

            System.out.println(sb.toString());
        }
    }
}
