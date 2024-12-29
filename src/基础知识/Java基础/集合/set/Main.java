package 基础知识.Java基础.集合.set;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * @Description 给一个数字，然后逆序输出顺序的不重复的数字。例如 33456799 到 976543 ACM 模式 https://www.nowcoder.com/feed/main/detail/a27410f1cc614cae935c3e54ef59a6ef
 * @Author Gao Hang Hang
 * @Date 2024-12-27 23:22
 **/
public class Main {
    // 33456799 976543

    // 12341   1432
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) {
            String target = in.next();
            String reverse = new StringBuffer(target).reverse().toString();

            LinkedHashSet<Character> set = new LinkedHashSet<>();
            char[] charArray = reverse.toCharArray();
            for (char c : charArray) {
                set.add(c);
            }

            StringBuilder stringBuilder = new StringBuilder();
            for (Character i : set) {
                stringBuilder.append(i);
            }

            System.out.println(stringBuilder);
            break;
        }
    }
}
