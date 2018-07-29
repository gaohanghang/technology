package 基础知识.数据结构.Java版数据结构与算法.算法.排序算法.a_选择排序;

/**
 * 选择排序
 *
 * {9,3,4,5,2,6,2,0,11}
 * 0{9,3,4,5,2,5,6,2,11}
 * 0 2 {9,3,4,5,8,6,11}
 * 0 2 3 {}
 * @author GaoHangHang
 * @date 2018/07/23 14:34
 **/
public class SelectSort {

    public void selectSort(int[] array){
        int min;
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            min = array[i];
            for (int j = i; j < array.length; j++) {
                if (array[j] < min){
                    min = array[j];//最小值
                    tmp = array[i];
                    array[i] = min;
                    array[j] = tmp;
                }
            }
        }
        for (int num : array) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        SelectSort selectSort = new SelectSort();
        selectSort.selectSort(new int[]{9,4,2,6,7,3,10,33,88,1,17});
    }


}
