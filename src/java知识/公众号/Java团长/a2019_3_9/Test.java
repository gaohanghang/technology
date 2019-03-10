package java知识.公众号.Java团长.a2019_3_9;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2019/03/09 21:06
 */
public class Test {
    public static void main(String[] args) {
        for (Chenmo e : Chenmo.values()) {
            System.out.println(e);
        }

        Chenmo key = Chenmo.WANGER;
        switch (key) {
            case WANGSI:
                System.out.println("今天我送出一个CSDN大鼠标");
                break;
            case WANGSAN:
                System.out.println("今天我被坑一个CSDN学院年卡");
                break;
            default:
                System.out.println("今天我一边高兴，一边失落");
                break;
        }
    }
}
