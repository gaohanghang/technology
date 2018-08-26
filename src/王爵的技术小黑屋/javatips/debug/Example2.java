package 王爵的技术小黑屋.javatips.debug;

/**
 * 条件断点
 *
 * @author GaoHangHang
 * @date 2018/08/19 21:35
 **/
public class Example2 {

    private static void execute(int num) {
        System.out.println("execute: " + num);
        // TODO
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            execute(i);
        }
    }
}
