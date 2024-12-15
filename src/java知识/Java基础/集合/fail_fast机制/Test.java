package java知识.Java基础.集合.fail_fast机制;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author Gao Hanghang
 * @version 1.0
 * @description
 * @date 2024-09-24 13:43
 **/
public class Test {
    public static void main(String[] args) {
        //List<String> list = new ArrayList<>();
        //list.add("1");
        //list.add("2");
        //list.add("3");
        //list.add("4");
        //Iterator<String> iter = list.iterator();
        //while (iter.hasNext()) {
        //    String tmp = iter.next();
        //    System.out.println(tmp);
        //    if (tmp.equals("1")) {
        //        list.remove("1");
        //    }
        //}

        //List<String> list = new ArrayList<>();
        //list.add("1");
        //list.add("2");
        //list.add("3");
        //list.add("4");
        //Iterator<String> iter = list.iterator();
        //while (iter.hasNext()) {
        //    String tmp = iter.next();
        //    System.out.println(tmp);
        //    if (tmp.equals("3")) {
        //        list.remove("3");
        //    }
        //}

        //List<String> list = new ArrayList<>();
        //list.add("1");
        //list.add("2");
        //list.add("3");
        //list.add("4");
        //Iterator<String> iter = list.iterator();
        //while (iter.hasNext()) {
        //    String tmp = iter.next();
        //    System.out.println(tmp);
        //    if (tmp.equals("4")) {
        //        list.remove("4");
        //    }
        //}

        //List<String> list = new ArrayList<>();
        //list.add("1");
        //list.add("2");
        //list.add("3");
        //list.add("4");
        //for (String i : list) {
        //    if ("1".equals(i)) {
        //        list.remove("1");
        //    }
        //}

        //List<String> list = Arrays.asList("1", "2", "3", "4");
        //for (String i : list) {
        //    if ("1".equals(i)) {
        //        list.remove("1");
        //    }
        //}

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String tmp = iter.next();
            System.out.println(tmp);
            if (tmp.equals("1")) {
                iter.remove();
            }
        }
    }
}
