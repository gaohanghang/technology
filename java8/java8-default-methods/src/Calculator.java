import java.util.Calendar;

/**
 * 计算器接口
 *
 * @author: Gao HangHang
 * @date 2018/10/06
 */
public interface Calculator {

    int add(int first, int second);

    int subtract(int first, int second);

    int multiply(int first, int second);

    int divide(int number, int divisor);

    default int mod(int first, int second){
        return first % second;
    }

    static Calculator getInstance(){
        return new BasicCalculator();
    }
}