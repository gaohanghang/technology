package 牛客网.华为.a1字符串最后一个单词的长度;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] arr = line.split(" ");
        System.out.println(arr[arr.length - 1].length());
    }
}
