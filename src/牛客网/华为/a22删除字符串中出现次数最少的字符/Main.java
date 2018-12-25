package 牛客网.华为.a22删除字符串中出现次数最少的字符;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {

            String string = sc.nextLine();
            char[] A = string.toCharArray();
            Map<Character, Integer> m = new LinkedHashMap<>();


            for (char c : A) {
                if (!m.containsKey(c)) {
                    m.put(c, 1);
                } else {
                    m.put(c, m.get(c) + 1);
                }
            }
            //获取最小的次数
            Collection<Integer> al = m.values();
            int index = Collections.min(al);
            StringBuffer sb = new StringBuffer();
            //将出现次数不是最小次数的放进StringBuffer中
            for (char c : A) {
                if (m.get(c) != index)
                    sb.append(c);
            }

            System.out.println(sb.toString());
        }
    }
}
