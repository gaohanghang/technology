package java知识.知识星球.a44comparator接口与Comparable接口的区别;

/**
 * Created by GaoHangHang 2018-05-17 18:09
 **/
public class Test {
    public static void main(String[] args) {
        String s1 = "aa";
        String s2 = "ab";
        // 返回的是两字符串第一个不同的char的unicode编码的差
        System.out.println(s1.compareTo(s2));
        Integer i1 = 3;
        Integer i2 = 2;
        // 前者大返回1，后者大返回-1，相等返回0
        System.out.println(i1.compareTo(i2));
    }
}
