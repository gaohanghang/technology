package java知识.公众号.Java技术栈.a2018.a5_29;

public class Sub extends Super {
    int x = 200;

    public Sub(String s) {

    }

    public Sub() {
        System.out.println("Sub");
    }

    public static void main(String[] args) {
        Sub s = new Sub();
    }
}
