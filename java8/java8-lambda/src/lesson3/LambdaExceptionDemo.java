package lesson3;

import java.io.IOException;
import java.util.stream.Stream;

/**
 * @author: Gao HangHang
 * @date 2018/10/06
 */
public class LambdaExceptionDemo {
    // 编写一个泛型方法对异常进行包装
    static <E extends Exception> void doThrow(Exception e) throws E {
        throw  (E)e;
    }

    //编译通过
    public static void main(String[] args) {
        //编译通过
        Stream.of("a", "b", "c").forEach(str -> {
            doThrow(new IOException());
        });
    }
}
