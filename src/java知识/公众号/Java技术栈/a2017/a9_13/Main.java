package java知识.公众号.Java技术栈.a2017.a9_13;

public class Main {
    public static void main(String[] args) {
        // example1
        String str1 = "s1";
        System.out.println(str1 + 100);//s1100
        System.out.println(100 + str1);//100s1

        String str2 = "s2";
        str2 = str2.concat("a").concat("bc");
        System.out.println(str2);//s2abc

        // example2
        String str3 = "s3";
        System.out.println(str3 + null);//s3null
        System.out.println(null + str3);//nulls3

        String str4 = null;
        System.out.println(str4.concat("a"));//NullPointerException
        System.out.println("a".concat(str4));//NullPointerException
    }
}
