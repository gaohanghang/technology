package java知识.公众号.骇客与画家.a2020.a6_1;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2020-06-01 01:28
 **/
public class findPrimeNumbers {

    public static void main(String[] args) {
        // 循环
        for (int i = 2; i < 100; i++) {
            int temp = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    temp = 1;
                }
            }
            if (temp != 1) {
                System.out.println(i);
            }
        }
    }

}
