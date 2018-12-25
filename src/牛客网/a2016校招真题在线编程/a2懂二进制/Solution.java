package 牛客网.a2016校招真题在线编程.a2懂二进制;

public class Solution {
    /**
     *      * 获得两个整形二进制表达位数不同的数量
     *      *
     *      * @param m 整数m
     *      * @param n 整数n
     *      * @return 整型
     *      
     */
    public int countBitDiff(int m, int n) {
        String str = Integer.toBinaryString(m ^ n);
        str = str.replaceAll("0", "");
        return str.length();
    }
}
