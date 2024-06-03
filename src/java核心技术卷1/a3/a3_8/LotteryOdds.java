package java核心技术卷1.a3.a3_8;

import java.util.Scanner;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/01 3:33 PM
 */
public class LotteryOdds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers do you need to draw? ");
        int k = in.nextInt();

        System.out.println("What is the highest number you can draw? ");
        int n = in.nextInt();

        /**
         * computer binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
         */

        int lotteryOdds = 1;
        for (int i = 1; i < k; i++) {
            lotteryOdds = lotteryOdds * (n - i + 1) / i;
        }
        System.out.println("Youe odds are 1 in " + lotteryOdds + ". Good luck!");
    }
}
