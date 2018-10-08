/**
 * @author: Gao HangHang
 * @date 2018/10/06
 */
public class CalculatorFactory {

    public static Calculator getInstance() {
        return new BasicCalculator();
    }

}
