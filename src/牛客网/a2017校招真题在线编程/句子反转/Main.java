package 牛客网.a2017校招真题在线编程.句子反转;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            String arr[] = str.split(" ");
            StringBuffer res = new StringBuffer();
            for (int i = arr.length-1; i > 0; i--) {
                res.append(arr[i]+" ");
            }
            res.append(arr[0]);
            System.out.println(res.toString());
        }
    }
}
