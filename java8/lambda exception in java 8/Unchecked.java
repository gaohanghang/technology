import java.util.Objects;
import java.util.function.Function;

/**
 * Oracle 在设计 Java 8 的时候犯了个错，导致我们在 lambda 中遇到异常变得难以处理，这个视频中介绍如何解决这些问题，以及 Java 中的泛型擦除黑魔法。
 * <p>
 * 课程代码：https://github.com/biezhi/java-tips/b...
 * StackOverFlow帖子：https://stackoverflow.com/questions/27644361/how-can-i-throw-checked-exceptions-from-inside-java-8-streams
 *
 * @author GaoHangHang
 * @date 2018/07/28 21:40
 **/
public final class Unchecked {

    @FunctionalInterface
    interface ExceptionFunction<T, R> {
        R apply(T t) throws Exception;
    }

    public static <T, R> Function<T, R> wrap(ExceptionFunction<T, R> mapper) {
        Objects.requireNonNull(mapper);
        return t -> {
            try {
                return mapper.apply(t);
            } catch (Exception e) {
                throwException(e);
                return null;
            }
        };
    }

    public static <T extends Exception> void throwException(Exception e) throws T {
        throw (T) e;
    }
}
