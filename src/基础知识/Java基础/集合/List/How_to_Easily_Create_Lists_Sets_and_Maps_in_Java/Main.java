package 基础知识.Java基础.集合.List.How_to_Easily_Create_Lists_Sets_and_Maps_in_Java;

import java.util.*;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-06-27 23:24
 **/
public class Main {

    public static void main(String[] args) {

        // Lists

        List<String> listTillJava8 = Arrays.asList("Hello", "World");
        System.out.println("listTillJava8 = " + listTillJava8);

        //List<String> listsincejava9 = List.of("Hello", "World");
        //System.out.println("listsincejava9 = " + listsincejava9);

        // set
        HashSet<String> setTillJava8 = new HashSet<>(Arrays.asList("Hello", "World"));
        System.out.println("setTillJava8 = " + setTillJava8);

        //Set<String> setSinceJava9 = Set.of("me", "me", "me");
        //System.out.println("setSinceJava9 = " + setSinceJava9);

        // maps

        HashMap<String, String> mapTillJava8 = new HashMap<>();
        mapTillJava8.put("hello", "world");

        //Map<String, String> mapSinceJava9 = Map.of("hello", "world", "bla", "bla");
        //System.out.println(mapSinceJava9);
    }
}
