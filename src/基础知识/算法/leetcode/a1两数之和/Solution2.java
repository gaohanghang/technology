package 基础知识.算法.leetcode.a1两数之和;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 1. 两数之和
 * @author: Gao Hang Hang
 * @date 2018/12/26 11:33
 */
public class Solution2 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] ints = twoSum3(nums, target);
        System.out.println(Arrays.toString(ints));
    }

    // 方法一：暴力法 时间复杂度 O(n^2) 空间复杂度 O(1)
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{ i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    //方法二：两遍哈希表 时间复杂度 O(n) 空间复杂度 O(n)
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{ i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    // 方法三：一遍哈希表 时间复杂度 O(n) 空间复杂度 O(n)
    public static int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}