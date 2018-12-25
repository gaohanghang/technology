package java知识.java核心技术.a3.a3_6.a3_6_3;

/**
 * @Description: 不可变字符串
 * @author: Gao Hang Hang
 * @date 2018/11/29 10:53 PM
 */
public class MainTest {
    public static void main(String[] args) {
        java.lang.String greeting = "Hello";
        java.lang.String s = greeting.substring(0, 3) + "p!";
        System.out.println(s);
    }
}
