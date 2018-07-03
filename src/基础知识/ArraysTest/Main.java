package 基础知识.ArraysTest;

import java.util.Arrays;

/**
 * 1、Arrays.sort(int[] a)
 * 这种形式是对一个数组的所有元素进行排序，并且是按从小到大的顺序。
 * @author GaoHangHang
 * @date 2018/06/28 10:11
 **/
public class Main {
    public static void main(String[] args) {
        int[] a = {9,8,7,2,3,4,1,0,6,5};
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
