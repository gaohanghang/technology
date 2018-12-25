package 基础知识.ArraysTest;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author GaoHangHang
 * @date 2018/06/28 10:19
 **/
public class Main3 {
    public static void main(String[] args) {
        // 注意，要想改变默认排序，不能使用基本类型（int,double,char）
        // 而要使用它们对应得类
        Integer[] a = {9, 8, 7, 2, 3, 4, 1, 0, 6, 5};
        // 定义一个自定义类MyComparator的对象
        Comparator cmp = new MyComparator();
        Arrays.sort(a, cmp);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}

// Comparator是一个接口，所以这两我们自己定义的类MyComparator要implents该接口
// 而不是extends Comapartor
class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        // 如果n1小于n2，我们就返回正值，如果n1大于n2我们就返回负值
        // 这样颠倒一下，就可以实现反向排序了
        if (o1 < o2) {
            return 1;
        } else if (o1 > o2) {
            return -1;
        } else {
            return 0;
        }
    }
}
