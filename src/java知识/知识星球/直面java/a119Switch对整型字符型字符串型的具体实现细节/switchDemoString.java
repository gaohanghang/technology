package java知识.知识星球.直面java.a119Switch对整型字符型字符串型的具体实现细节;

/**
 * @author GaoHangHang
 * @date 2018/08/21 20:02
 **/
public class switchDemoString {
    public static void main(String[] args) {
        String str = "world";
        switch (str) {
            case "hello":
                System.out.println("hello");
                break;
            case "world":
                System.out.println("world");
                break;
            default:
                break;
        }
    }
}
