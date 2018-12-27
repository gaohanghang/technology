package 基础知识.算法.leetcode.a283移动零;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/move-zeroes/comments/
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/27 10:31
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes5(nums);
    }

    public static void moveZeroes1(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != j) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes2(int[] nums) {
        int j = 0; // 表明不为0的数字的个数
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) { // 非0判断
                nums[j] = nums[i]; // 非0交换位置
                if (i != j) { // 如果数组下标和交换位置
                    nums[i] = 0;
                }
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes3(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }


    // 滚雪球式子
    public static void moveZeroes4(int[] nums) {
        int snowBallSize = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                snowBallSize++;
            } else if (snowBallSize > 0) {
                int t = nums[i];
                nums[i] = 0;
                nums[i - snowBallSize] = t;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    // https://leetcode.com/problems/move-zeroes/discuss/72011/Simple-O(N)-Java-Solution-Using-Insert-Index
    public static void moveZeroes5(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int insertPos = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++]  = num;
            }
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
