package 牛客网.华为.a13字串的连接最长路径查找;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by GaoHangHang 2018-04-28 16:59
 **/
public class Main {
    /*
        next方法不能得到带空格的字符串
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String[] ss = new String[num];
        for (int i = 0; i < num; i++) {
            ss[i] = scanner.next();
        }
        Arrays.sort(ss);
        for (int i = 0; i < ss.length; i++) {
            System.out.println(ss[i]);
        }
    }
}
