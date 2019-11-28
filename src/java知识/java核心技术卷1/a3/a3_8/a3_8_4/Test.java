package java知识.java核心技术卷1.a3.a3_8.a3_8_4;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/01 3:17 PM
 */
public class Test {
    public static void main(String[] args) {
        // for (int i = 10; i > 0 ; i++) {
        //     System.out.println("counting down ... " + i);
        //     System.out.println("Blastoff!");
        // }

        for (double x = 0; x != 10; x += 0.1) {
            System.out.println(x);
        }

        for (int i = 0; i <= 10; i++) {

        }

        for (int i = 11; i <= 20; i++) { // OK to define another variable named i

        }

        for (int i = 10; i > 0; i--)
            System.out.println("Counting down ... " + i);

        int i = 10;
        while (i > 0) {
            System.out.println("Counting down ..." + i);
            i--;
        }
    }
}
