package 慕课网.a二进制与Java中的基本数据类型;

import java.math.BigInteger;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2020-05-24 01:37
 **/
public class BigIntegerTest {

    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("29");
        BigInteger b2 = new BigInteger("1010", 2);
        BigInteger b3 = BigInteger.valueOf(33l);

        /*System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString(2));*/
        BigInteger add = b1.add(b2);
        BigInteger sub = b1.subtract(b2);
        BigInteger mul = b1.multiply(b2);
        BigInteger div = b1.divide(b2);
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
    }

}
