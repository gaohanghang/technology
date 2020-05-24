package 慕课网.a二进制与Java中的基本数据类型;

import lombok.val;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2020-05-24 01:53
 **/
public class BigDecimalTest {
    public static void main(String[] args) {
       /*BigDecimal b1 = new BigDecimal("0.1");
        BigDecimal b2 = new BigDecimal(0.1);
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        BigDecimal b3 = new BigDecimal(0.1 + "");
        System.out.println(b3.toString());
        BigDecimal bigDecimal = BigDecimal.valueOf(0.1);
        System.out.println(bigDecimal);*/
        BigDecimal b1, b2;
        b1 = BigDecimal.valueOf(0.3);
        b2 = BigDecimal.valueOf(0.1);
        BigDecimal div1 = b1.divide(b2);
        System.out.println(div1);
        BigDecimal div2 = b2.divide(b1, new MathContext(5, RoundingMode.HALF_UP));
        System.out.println(div2);
    }
}
