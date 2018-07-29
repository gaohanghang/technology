package 基础知识.数据结构.Java版数据结构与算法.算法.排序算法.a1_插入排序;

/**
 * @author GaoHangHang
 * @date 2018/07/23 17:14
 **/
public class HeerSort {
    public static void main(String[] args) {
        int[] a = {49,38,44,2,0,7,28,1,-9,7,2,5,23,12,99,76};
        int d = a.length/2;//默认增量是8
        while (true){
            for (int i = 0; i < d; i++) {
                for (int j = i; j + d < a.length; j++) {
                    int tmp;
                    if (a[j]>a[j+d]){
                        tmp = a[j];
                        a[j] = a[j+d];
                        a[j+d] = tmp;
                    }
                }
            }
            if (d == 1){break;}
            d--;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(" "+ a[i]);
        }
    }
}
