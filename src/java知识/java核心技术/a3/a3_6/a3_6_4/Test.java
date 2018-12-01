package java知识.java核心技术.a3.a3_6.a3_6_4;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/11/29 10:58 PM
 */
public class Test {
    public static void main(String[] args) {
        String greeting = "Hello";

        if ("Hello".equalsIgnoreCase("hello")) {

        }

        if (greeting == "Hello");
            // probably true
        if (greeting.substring(0, 3) == "Hel");
            // probably false

        System.out.println(greeting.compareTo("Hello") == 0);
    }
}
