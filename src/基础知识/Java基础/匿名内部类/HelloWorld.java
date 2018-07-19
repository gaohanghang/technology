package 基础知识.Java基础.匿名内部类;

/**
 * @author GaoHangHang
 * @date 2018/07/19 11:51
 **/
public class HelloWorld {

    public static void main(String[] args) {

        //匿名类
        new Thread() {
            @Override
            public void run() {

            }
        };
        //匿名类2
        new Runnable() {
            @Override
            public void run() {

            }
        };
    }
}
