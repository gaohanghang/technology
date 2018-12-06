package java知识.java核心技术.a3.a3_10.a3_10_6;

/**
 * This program shows how to store tbular data int a 20 array.
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/06 9:02 PM
 */
public class CompoundInterest {
    public static void main(String[] args) {
        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;


        // set interest rates to 10 . . . 15%
        double[] interestRate = new double[NRATES];
        for (int j = 0; j < interestRate.length; j++)
            interestRate[j] = (STARTRATE + j) / 100.0;

        double[][] balances = new double[NYEARS][NRATES];

        // set initial for future years
        for (int j = 0; j < balances[0].length; j++)
            balances[0][j] = 10000;

        //  compute interest for future years
        for (int i = 1; i < balances.length; i++) {
            for (int j = 0; j < balances[i].length; j++) {
                // get last year's balances from previous row
                double oldBalance = balances[i - 1][j];

                // compute interest 计算利率
                double interest = oldBalance * interestRate[j];


                // compute this year's balances
                balances[i][j] = oldBalance + interest;
            }
        }

        // print one row of interest rates
        for (int j = 0; j < interestRate.length; j++)
            System.out.printf("%9.0f%%",100 * interestRate[j]);


        System.out.println();

        // print balance table
        for (double[] balance : balances) {
            // print table row
            for (double b : balance)
                System.out.printf("%10.2f", b);

            System.out.println();
        }
    }
}
