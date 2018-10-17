package javatips;

/**
 * @author: Gao HangHang
 * @date 2018/10/15
 */
public class Unchecked {

    @FunctionalInterface
    interface ExceptionFunction<T, R> {
        R apply(T t) throws Exception;
    }


}
