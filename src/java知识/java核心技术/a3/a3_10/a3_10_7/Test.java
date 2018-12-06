package java知识.java核心技术.a3.a3_10.a3_10_7;

import java.util.Arrays;
import java.util.Base64;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/06 9:32 PM
 */
public class Test {
    public static void main(String[] args) {

        double[][] balances;
        // double[] temp = balances[i];
        // balances[i] = balances[i + 1];
        // balances[i + 1] = temp;

        int NMAX = 6;

        int[][] odds = new int[NMAX + 1][];

        for (int n = 0; n <= NMAX; n++)
            odds[n] = new int[n + 1];

        for (int n = 0; n < odds.length; n++) {
            for (int k = 0; k < odds[n].length; k++) {
                // compute lotteryOdds
                odds[n][k] = 1;
            }
        }

        // for (int i = 0; i < 10; i++)
        //     balances[i] = new double[6];

    }
}
