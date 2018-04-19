package 牛客网.华为.a10字符个数统计;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char ch[] = str.toCharArray();

        HashSet<Character> set = new HashSet();
        for (int i = 0; i < ch.length; i++) {
            set.add(ch[i]);
        }
        System.out.println(set.size());
    }
}
