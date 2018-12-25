package 牛客网.华为.a2计算字符个数;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int count = 0;

        Scanner in = new Scanner(System.in);

        String str = in.nextLine().toUpperCase();

        char target = in.nextLine().toUpperCase().toCharArray()[0];

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }

        System.out.println(count);
    }
}
