package 基础知识.ArraysTest;

import java.util.Arrays;

/**
 * Arrays.sort(int[] a, int fromIndex, int toIndex)
 * 这种形式是对数组部分排序，也就是对数组a的下标从fromIndex到toIndex-1的元素排序，
 * 下标为toIndex的元素不参与排序哦！
 * @author GaoHangHang
 * @date 2018/06/28 10:13
 **/
public class Main2 {
    public static void main(String[] args) {
        int[] a = {9, 8, 7, 2, 3, 4, 1, 0, 6, 5};
        Arrays.sort(a,0,3);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+" ");
        }
    }
}
