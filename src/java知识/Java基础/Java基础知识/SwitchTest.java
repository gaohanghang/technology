package java知识.Java基础.Java基础知识;

public class SwitchTest {
    public static void main(String[] args) {
        int a = 2;
        switch (a) {
            case 1:
                System.out.println("print 1");
                break;
            case 2:
            case 3:
                System.out.println("print 3");
                break;
        }
    }
}
