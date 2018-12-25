package 基础知识.数据结构.Java版数据结构与算法.算法.排序算法.a1_插入排序;

/**
 * 1. 直接插入排序
 * <p>
 * 插入排序空间复杂度高 n^2
 * <p>
 * {9,3,2,6,10,44,83,28,5,1,0,36}
 * 2 3 6 9 10
 *
 * @author GaoHangHang
 * @date 2018/07/23 15:26
 **/
public class InsertSort {
    public static void main(String[] args) {
        int[] a = {48, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1};
        System.out.println("排序之前");
        //直接插入排序开始
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];//新遍历的值，等待插入到前面的有序数组
            int j;
            for (j = i - 1; j >= 0; j--) {
                //将大于temp的数往后面移一步
                if (a[j] > temp) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(" " + a[i]);
        }
    }
}
