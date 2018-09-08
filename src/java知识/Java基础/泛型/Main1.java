package java知识.Java基础.泛型;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {

        List<String> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<Integer>();

        System.out.println(l1.getClass() == l2.getClass());

    }

}
