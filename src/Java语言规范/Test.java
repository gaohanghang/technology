package Java语言规范;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2020-12-20 03:00
 **/
public class Test {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(i == 0 ? args[i] : " " + args[i]);
        }
        System.out.println();
    }

}
