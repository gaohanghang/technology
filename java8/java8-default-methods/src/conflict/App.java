package conflict;

/**
 * @author: Gao HangHang
 * @date 2018/10/06
 */
public class App implements A {

    @Override
    public void sayHello() {
        System.out.println("你好，我是 APP");
    }

    public static void main(String[] args) {
        new App().sayHello();
    }

}
