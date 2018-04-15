package 牛客网.华为.a5进制转换;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.next().substring(2);
            System.out.println(Integer.parseInt(str,16));
        }
    }
}
