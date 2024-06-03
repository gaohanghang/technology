package java核心技术卷1.a3.a3_10;

/**
 * @Description: 数组
 * @author: Gao Hang Hang
 * @date 2018/12/01 4:48 PM
 */
public class Test {
    public static void main(String[] args) {
        int[] a = new int[100];
        for (int i = 0; i < 100; i++) {
            a[i] = i; // fills the array with numbers 0 to 99
        }

        String[] names = new String[10];

        for (int i = 0; i < 10; i++) {
            names[i] = "";
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
