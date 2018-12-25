package 牛客网.华为.a3明明的随机数;

import java.util.Scanner;
import java.util.TreeSet;

/*
    输入描述:
        输入多行，先输入随机整数的个数，再输入相应个数的整数


    输出描述:
        返回多行，处理后的结果

    输入
    11
    10
    20
    40
    32
    67
    40
    20
    89
    300
    400
    15
    输出
    10
    15
    20
    32
    40
    67
    89
    300
    400
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {

            TreeSet<Integer> set = new TreeSet<Integer>();
            int n = sc.nextInt();
            if (n > 0) {
                for (int i = 0; i < n; i++) {
                    set.add(sc.nextInt());
                }
            }
            for (Integer i : set) {
                System.out.println(i);
            }
        }
    }
}
