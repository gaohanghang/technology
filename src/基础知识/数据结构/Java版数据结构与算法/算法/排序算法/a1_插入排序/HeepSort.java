package 基础知识.数据结构.Java版数据结构与算法.算法.排序算法.a1_插入排序;

/**
 * @author GaoHangHang
 * @date 2018/07/23 20:38
 **/
public class HeepSort {
    //堆排序
    public static void main(String[] args) {
        int[] array = {39, 44, 1, 0, 8, 66, 23, 67, 9, 15, 100, 70, 22, 3, 6, 54};
    }

    public void heapSort(int[] a) {
        if (a == null || a.length <= 1) {
            return;
        }
        //创建大堆
        buildMaxHeap(a);
    }

    private void buildMaxHeap(int[] a) {
        int half = (a.length - 1) / 2;//假设长度为9
        for (int i = half; i >= 0; i++) {
            //只需遍历43210
            //length表示
            maxHeap(a, a.length, i);
        }
    }

    private void maxHeap(int[] a, int length, int i) {
        int left = i * 2 + 1;
        int right = i * 2 + 2;

    }


}
