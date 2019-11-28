package java知识.java核心技术卷1.a3.a3_6.a3_6_6;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/11/29 11:15 PM
 */
public class Test {
    public static void main(String[] args) {
        String greeting = "Hello";
        int n = greeting.length(); // is 5.

        int cpCount = greeting.codePointCount(0, greeting.length());
        System.out.println(cpCount);

        char first = greeting.charAt(0); // first is 'H'
        char last = greeting.charAt(4);  // last is 'o'

    }
}
