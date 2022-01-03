package java核心技术卷1.a3.a3_8;

import java.util.Scanner;

/**
 * This program demonstrates a <code>while</code> loop
 *
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/01 2:43 PM
 */
public class Retirement {
    public static void main(String[] args) {
        // read inputs
        Scanner in = new Scanner(System.in);

        System.out.println("How much money do you need to retire? ");
        double goal = in.nextDouble();

        System.out.println("How much money will you contribute every year? ");
        double payment = in.nextDouble();

        System.out.println("Interest rate in %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        // update account balance
        while (balance < goal) {
            // add this year's payment and interest
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }
        System.out.println("You can retire in " + years + " years.");
    }
}
