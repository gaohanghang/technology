package java知识.公众号.Hollis.a2_28;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[3]; //使用length获取数组的程序
        System.out.println(arr.getClass());
        System.out.println(arr.length);//3
        int[][] b = new int[3][5];
        System.out.println(b.length);//3

        String str = "abc";
        System.out.println(str.length());//使用length()获取字符串的长度

        char[] s = {'a', 'b', 'c'};
        String string1 = s.toString();
        String string2 = new String(s);
        String string3 = String.valueOf(s);
    }
}
