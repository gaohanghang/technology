package java知识.尚学堂.java300讲.testwrappedclass.cn.bjsxt.test;

/**
 * @author: Gao HangHang
 * @date 2018/10/20
 */
public class Test01 {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.toHexString(i));
        Integer i2 = Integer.parseInt("234");
        Integer i3 = new Integer("333");
        System.out.println(i2.intValue());

        String str = 234 + "";

    }
}
