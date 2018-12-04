package java知识.java核心技术.a3.a3_10.a3_10_2;

/**
 * @Description: 数组初始化以及匿名数组
 * @author: Gao Hang Hang
 * @date 2018/12/04 10:29 PM
 */
public class Test {
    public static void main(String[] args) {
        int[] smallPrimes = {2, 3, 5, 7 ,11 ,13};
        int[] anonymous = { 17, 19, 23, 29, 31, 37};
        smallPrimes = anonymous;

        int[] ints = new int[0];
    }
}
