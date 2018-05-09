package java知识.公众号.Java技术栈.a2018.a4_23;


import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Math.random();

       /* for (int i = 0; i < 20; i++) {
            int num = new Random().nextInt(10);
            System.out.println(num);
        }*/

        for (int i = 0; i < 20; i++) {
            int num = ThreadLocalRandom.current().nextInt(10);
            System.out.println(num);
        }
        
    }
}
