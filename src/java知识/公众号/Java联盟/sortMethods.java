package java知识.公众号.Java联盟;

/**
 * Created by GaoHangHang 2018-05-28 14:19
 **/
public class sortMethods {
    public static void main(String[] args) {
        int a[] = {8, 3, 2, 5, 9, 3, 6};
        bubbleSort(a);
        Print(a);
    }

    //冒泡排序
    private static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void Print(int[] a) {
        for (int num : a) {
            System.out.print(num + "\t");
        }
        System.out.println();
    }
}
