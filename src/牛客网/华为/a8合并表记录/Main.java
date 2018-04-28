package 牛客网.华为.a8合并表记录;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TreeMap<Integer,Integer> map = new TreeMap<>();

        int size = sc.nextInt();

        while (sc.hasNext()){

            int key = sc.nextInt();
            int val=sc.nextInt();

            if(map.containsKey(key)){
                map.put(key,val+map.get(key));
            }else {
                map.put(key,val);
            }
        }

        for (int key: map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
    }

}
