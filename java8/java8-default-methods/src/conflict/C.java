package conflict;

/**
 * @author: Gao HangHang
 * @date 2018/10/06
 */
public interface C extends A{

    default void sayHello(){
        System.out.println("你好，我是渣渣辉");
    }
}
