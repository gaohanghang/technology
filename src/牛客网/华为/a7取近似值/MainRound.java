package 牛客网.华为.a7取近似值;

import java.util.Scanner;

/**
 * Created by GaoHangHang 2018-04-18 19:57
 **/
public class MainRound {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextDouble()){
            double l = sc.nextDouble();
            System.out.println(Math.round(l));
        }
    }
}
