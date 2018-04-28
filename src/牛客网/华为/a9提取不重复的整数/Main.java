package 牛客网.华为.a9提取不重复的整数;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String str = sc.nextLine();
            char[] nums = str.toCharArray();
            Set<Character> st = new LinkedHashSet<>();
            for (int i = nums.length-1; i >=0 ; i--) {
                st.add(nums[i]);
            }
            String result = "";
            for (Character c : st) {
                result += c+"";
            }
            System.out.println(result);
        }
    }
}
