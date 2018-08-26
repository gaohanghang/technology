package 王爵的技术小黑屋.javatips.debug;

/**
 * 基本使用
 *
 * @author GaoHangHang
 * @date 2018/08/19 21:20
 **/
public class Example1 {

    static class CustomException extends RuntimeException {
        public CustomException(String message) {
            super(message);
        }
    }

    private static void helloIntellij() {
        System.out.println("我来自北方");
        System.out.println("44");
        Runtime runtime = Runtime.getRuntime();
        throw new CustomException("I,m worry.");
    }

    public static void main(String[] args) {
        helloIntellij();
        System.out.println("NO");
    }
}
