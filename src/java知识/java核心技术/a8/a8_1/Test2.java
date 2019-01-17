package java知识.java核心技术.a8.a8_1;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date _2019/01/06 20:01
 */
public class Test2 {
    public static void main(String[] args) {
        int hello_world = new Test2().lengthOfLastWord("Hello World");
        System.out.println(hello_world);
    }

    public int lengthOfLastWord(String s) {
        s = s.trim();
        return s.length() - 1 - s.lastIndexOf(' ');
    }
}
