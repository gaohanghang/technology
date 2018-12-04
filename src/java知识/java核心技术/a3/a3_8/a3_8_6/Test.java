package java知识.java核心技术.a3.a3_8.a3_8_6;

import java.util.Scanner;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/01 4:11 PM
 */
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        read_data:
        //while () // this loop statement is tagged with the label
        while (n < 1) {
          if (n<0) {
              break read_data;
          }
        }


        for (int count = 1; count <= 100; count++) {
            System.out.println("Enter a number, -1 to quit: ");
            n = in.nextInt();
            if (n < 0) continue;
            // not executed if n < 0
        }
    }
}
