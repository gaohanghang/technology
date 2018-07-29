package java知识.Java基础.常用接口.Comparable和Comparator的区别;

/**
 * @author GaoHangHang
 * @date 2018/07/28 16:02
 **/
public class ComparableTest {
    public static void main(String[] args) {
        String s1 = "aa";
        String s2 = "ab";
        //返回是两字符串第一个不同的char的unicode编码的差
        System.out.println(s1.compareTo(s2));
        Integer i1 = 3;
        Integer i2 = 2;
        //前者大返回1，后者大返回-1，相等返回0
        System.out.println(i1.compareTo(i2));
    }

}
