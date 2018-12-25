package java知识.java核心技术.a6.a6_2.a6_2_3;


import java知识.java核心技术.a6.a6_1_1.Employee;

import java.util.Arrays;

/**
 * @Description: 对象克隆
 * @author: Gao Hang Hang
 * @date 2018/12/24 16:42
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee original = new Employee("John Public", 50000);
        //Employee copy = original;
        //copy.raiseSalary(10); // oops--also changed original

        //Employee copy = original.clone();

        // 所有数组类型都有一个 public 的 clone 方法，而不是 protected。可以用这个方法建立一个新数组，包含原数组所有元素的副本。
        int[] luckyNumbers = {2, 3, 5, 7, 11, 13};
        int[] cloned = luckyNumbers.clone();
        cloned[5] = 12; // doesn't change luckNumbers[5]
        System.out.println(Arrays.toString(cloned));
    }
}
