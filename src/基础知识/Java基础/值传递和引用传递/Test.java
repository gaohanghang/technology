package 基础知识.Java基础.值传递和引用传递;

public class Test {
    public static void changeStr(String str) {
        str = new String("welcome");
    }

    public static void main(String[] args) {
        String str = "1234";
        changeStr(str);
        System.out.println(str);
    }
}
