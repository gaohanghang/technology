package 基础知识.算法.十道算法题Java实现.a1删除下标为k的元素;

import java.util.Arrays;

/**
 * 删除下标为k的元素
 *
 * @author: Gao HangHang
 * @date 2018/10/20
 */
public class a1 {

    public static void main(String[] args) {
        deleteK();
    }

    /**
     * 删除下标为k的元素
     */
    public static void deleteK() {

        //固定的常量(比数组元素的个数要大)
        int N = 10;

        int[] arrays = new int[N];

        //对数组进行初始化
        for (int i = 0; i < 8; i++) {
            arrays[i] = i;
        }

        Arrays.stream(arrays).forEach(System.out::print);


        //要删除下标
        int k = 7;

        for (int i = k; i < N - 1; i++) {
            arrays[i] = arrays[i + 1];
        }


        System.out.println("公众号：Java3y" + arrays);
        Arrays.stream(arrays).forEach(System.out::print);


    }

}
