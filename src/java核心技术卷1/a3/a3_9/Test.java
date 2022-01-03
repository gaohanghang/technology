package java核心技术卷1.a3.a3_9;

import java.math.BigInteger;

/**
 * @Description: 大数值
 * @author: Gao Hang Hang
 * @date 2018/12/01 4:25 PM
 */
public class Test {
    public static void main(String[] args) {
        BigInteger a = BigInteger.valueOf(100);
        BigInteger b = BigInteger.valueOf(10);
        BigInteger c = a.add(b); // c = a + b
        BigInteger d = c.multiply(b.add(BigInteger.valueOf(2))); // d = c * (b + 2)
    }
}
