package 牛客网.华为.a9提取不重复的整数;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuffer sb = new StringBuffer(str);
        Set s = new HashSet();
        sb.reverse();//字符串反转
        for (int i = 0; i < sb.length(); i++) {
            if (s.add(sb.substring(i,i+1))){
                //set不允许重复添加相同的元素
                System.out.print(sb.substring(i,i+1));
            }
        }
    }
}
