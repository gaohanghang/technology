/**
 * @author: Gao HangHang
 * @date 2018/10/06
 */
public class BasicCalculator implements Calculator {
    @Override
    public int add(int first, int second) {
        return first + second;
    }

    @Override
    public int subtract(int first, int second) {
        return first - second;
    }

    @Override
    public int multiply(int first, int second) {
        return first * second;
    }

    @Override
    public int divide(int number, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("divisor can't be zero.");
        }
        return number / divisor;
    }

}
