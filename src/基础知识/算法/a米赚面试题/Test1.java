package 基础知识.算法.a米赚面试题;

import java.util.Arrays;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/26 14:37
 */
public class Test1 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, -1, 3, 0};
        // int[] nums = {1};
        int[] sortedNums = sort(nums);
        System.out.println(Arrays.toString(sortedNums));
    }

    public static int[] sort(int[] nums) {
        int swapStart = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) { // 判断不为0的元素

                nums[swapStart] = nums[i]; // 将不为0的元素赋值给第一个位置

                // 置0判断，如果当前位置和交换位置相等就不置为0
                if (i != swapStart) {
                    nums[i] = 0;
                }

                swapStart++; // 交换位置累加
            }
        }
        return nums;
    }
}
