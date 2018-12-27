package 基础知识.算法.leetcode.a31下一个排列;

/**
 * https://leetcode-cn.com/problems/next-permutation/solution/
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/26 17:26
 */
public class Solution {

    public static void main(String[] args) {

    }

    // 15847558
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;

    }

    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
