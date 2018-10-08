package conflict;

/**
 * @author: Gao HangHang
 * @date 2018/10/06
 */
public interface A {

    default void sayHello() {
        System.out.println("你好，我是 Java 8");
    }

}
