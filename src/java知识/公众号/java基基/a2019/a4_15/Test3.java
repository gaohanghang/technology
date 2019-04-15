package java知识.公众号.java基基.a2019.a4_15;

/**
 * ""还是构造方法
 */
public class Test3 {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "abcd";
        System.out.println(a == b); // True
        System.out.println(a.equals(b)); // True
        String c = new String("abcd");
        String d = new String("abcd");
        System.out.println(c == d); // False
        System.out.println(c.equals(d)); // True
    }
}
