package java知识.java核心技术卷1.a3.a3_9;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/01 4:33 PM
 */
public class BigIntegerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many do you need to draw? ");
        int k = in.nextInt();

        System.out.println("What is the highest number you can draw? ");
        int n = in.nextInt();

        /*
         * compute binomial cofficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
         */

        BigInteger lotteryOdds = BigInteger.valueOf(1);

        for (int i = 1; i <= k; i++) {
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));

            System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
        }
    }
}
