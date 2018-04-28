package 牛客网.华为.a14求int型正整数在内存中存储时1的个数;

import java.util.Scanner;

/**
 * Created by GaoHangHang 2018-04-28 17:15
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s = Integer.toBinaryString(num);
        num=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='1'){
                num++;
            }
        }
        System.out.println(num);
    }
}
