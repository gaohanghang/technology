package java核心技术卷1.a3.a3_10.a3_10_3;

import java.util.Arrays;

/**
 * @Description: 数组拷贝
 * @author: Gao Hang Hang
 * @date 2018/12/04 10:37 PM
 */
public class Test {
    public static void main(String[] args) {
        int[] smallPrimes = {2, 3, 5, 7, 11, 13};

        int[] luckNumbers = smallPrimes;
        luckNumbers[5] = 12; // now smallPrimes[5] is also 12

        System.out.println(Arrays.toString(smallPrimes));

        // Arrays.copyof() 将一个数组的所有值拷贝到一个新的数组中去：
        int[] copiedLuckNumbers = Arrays.copyOf(luckNumbers, luckNumbers.length);
        copiedLuckNumbers[5] = 0;
        System.out.println(Arrays.toString(smallPrimes));

        // 第二个参数是新数组的长度
        luckNumbers = Arrays.copyOf(luckNumbers, 2 * luckNumbers.length);
    }
}
