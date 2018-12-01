package java知识.java核心技术.a3.a3_7;

import java.util.Scanner;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/11/30 7:27 PM
 */
public class InputTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // get first input
        System.out.println("What is your name? ");
        String name = in.nextLine();

        // get second input
        System.out.println("How old are you? ");
        int age = in.nextInt();

        // display output on console
        System.out.println("Hello, " + name + ", Next year, you'll be " + (age + 1));
    }
}
