package java知识.公众号.java基基.a2019.a4_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        //ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c","d"));
        //for (int i = 0; i < list.size(); i++) {
        //    list.remove(i);
        //}
        //System.out.println(list);


        //ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c","d"));
        //for (String s : list) {
        //    if (s.equals("a"))
        //        list.remove(s);
        //}

        ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c","d"));
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String s = iter.next();
            if (s.equals("a")) {
                iter.remove();
            }
        }
        System.out.println(list);
    }
}
