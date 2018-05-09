package java知识.公众号.Java技术栈.a2018.a5_8;

import jdk.net.SocketFlow;

public class Main {
    public static void main(String[] args) {
        // 使用包装类型
        Integer value = 5;
        switch (value) {
            case 3:
                System.out.println("3");
                break;
            case 5:
                System.out.println("5");
                break;
            default:
                System.out.println("defaule");
        }
        // 使用枚举类型
        /*Status status = Status.PROCESSING;
        switch (status) {
            case OPEN:
                System.out.println("open");
                break;
            case PROCESSING:
                System.out.println("processing");
                boolean;
            case CLOSE:
                System.out.println("close");
                break;
            default:
                System.out.println("default");
        }*/
    }
}
