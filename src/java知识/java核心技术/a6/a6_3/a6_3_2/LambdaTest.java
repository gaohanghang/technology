package java知识.java核心技术.a6.a6_3.a6_3_2;

import javax.swing.*;
import java.util.Arrays;

/**
 * @Description: This program demonstrates the use of lambda expressions
 * @author: Gao Hang Hang
 * @date 2018/12/24 18:05
 */
public class LambdaTest {
    public static void main(String[] args) {
        String[] planets = new String[]{"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

        Timer t = new Timer(1000, event -> System.out.println(Arrays.toString(planets)));

        // keep program running until user selects "Ok"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
