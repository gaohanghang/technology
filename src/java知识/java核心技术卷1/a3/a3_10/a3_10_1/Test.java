package java知识.java核心技术卷1.a3.a3_10.a3_10_1;

import java.util.Arrays;

/**
 * @Description: for each 循环
 * @author: Gao Hang Hang
 * @date 2018/12/04 10:24 PM
 */
public class Test {
    public static void main(String[] args) {
        int[] a = new int[100];
        for (int i = 0; i < 100; i++) {
            a[i] = i; // fills the array with numbers 0 to 99
        }

        for (int element : a) {
            System.out.println(element);
        }

        System.out.println(Arrays.toString(a));
    }
}
