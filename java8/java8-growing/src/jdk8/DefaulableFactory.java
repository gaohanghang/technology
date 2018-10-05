import java.util.function.Supplier;

/**
 * @author: Gao HangHang
 * @date 2018/10/05
 */
public interface DefaulableFactory {
    // Interfaces now allow static methods
    static Integer create(Supplier<Integer> supplier) {
        return supplier.get();
    }
}
