package 基础知识.算法.a米赚面试题;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/26 14:40
 */
public class Test2 {
    public static void main(String[] args) {
        int num = 158476551;
        System.out.println("begin: " + num);

        // 将自然数转为int数组
        String numStr = String.valueOf(num);
        int[] nums = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            char c = numStr.charAt(i);
            nums[i] = Integer.valueOf(String.valueOf(c));
        }

        // 获取下一个自然数
        int[] nextNaturalNumberArr = nextNaturalNumber(nums);
        StringBuilder stringBuilder = new StringBuilder();
        for (int item : nextNaturalNumberArr) {
            stringBuilder.append(String.valueOf(item));
        }
        System.out.println("end: " + stringBuilder.toString());
    }

    // 🌰：158476551 -> 158514567 16854499945 -> 16854445999
    public static int[] nextNaturalNumber(int[] nums) {
        // 1. 从右向左获取第一对升序数的下标 47
        int firstIndex = 0;
        int secondIndex = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                firstIndex = i - 1;
                secondIndex = i;
                break;
            }
        }

        // 2. 将第一个升序数与右侧数中第一个比升序数大的元素交换 4和5交换
        // 2.1 找到右侧数中第一个比升序数大的元素下标
        int firstNum = nums[firstIndex];
        int remainMaxIndex = 0; // 第一个比 num[i-1] 大的数的下标
        for (int i = nums.length - 1; i > firstIndex; i--) {
            if (nums[i] > firstNum) {
                remainMaxIndex = i;
                break;
            }
        }
        // 2.2 进行交换
        int[] swapedNums = swap(nums, firstIndex, remainMaxIndex);

        // 3. 交换后将右侧的数升序排列 76541 -> 14567
        int[] reversion = reversion(swapedNums, secondIndex);
        return nums;
    }

    // 指定从哪个开始之后的数字进行翻转 76541 -> 14567
    public static int[] reversion(int[] nums, int startIndex) {
        int i = startIndex;
        int j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
        return nums;
    }

    // 交换数组中的两个元素
    public static int[] swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return nums;
    }
}
