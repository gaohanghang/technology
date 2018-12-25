package 基础知识.算法.第二章排序.a2_1初级排序算法;

import edu.princeton.cs.algs4.StdIn;

import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by GaoHangHang 2018-05-26 9:46
 **/
public class Selection {
    public static void sort(Comparable[] a) {
        // 将a[]按升序排列
        int N = a.length;
        for (int i = 0; i < N; i++) {
            // 将a[i]和a[i+1..N]中最小的元素交换
            int min = i;
            for (int j = 0; j < N; j++) {
                if (less(a[j], a[min]))
                    min = j;
                exch(a, i, min);
            }
        }
    }

    // 对元素进行比较
    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    // 将元素交换位置
    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a) {
        // 在单行中打印数组
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            System.out.println();
        }
    }

    private static boolean isSorted(Comparable[] a) {
        // 测试数组元素是否有序
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // 从标准输入读取字符串，将它们排序并输出
        String[] a = StdIn.readAllStrings();
        sort(a);
        assert isSorted(a);
        show(a);
    }

}


