package 牛客网.华为.a0Scanner;

import java.util.Scanner;

/**
 * Created by GaoHangHang 2018-04-28 17:04
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //next方式接收字符串
        System.out.println("next方式接收：");
        String nextStr = sc.next();
        String nextStr2 = sc.next();
        System.out.println("next()输入结果:\n"+nextStr+nextStr2);
        System.out.println("nextLine方式接收：");
        String nextLineStr = sc.nextLine();
        System.out.println("第二个nextLine：");
        String nextLineStr2 = sc.nextLine();
        System.out.println("nextLine()输入结果:"+nextLineStr+"\n"+nextLineStr2);
        sc.close();
    }
}
