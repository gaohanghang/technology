package com.imooc.jdk11;

import java.util.List;

/**
 * <h1>List 新增加的 API</h1>
 */
public class ListExample {

    public static void main(String[] args) {

        List<String> list = List.of("java8", "java11", "java12");
        System.out.println(list);
        //list.clear();

        // 旧的方法: 传入 String[]
        String[] oldWay = list.toArray(new String[0]);

        // 新的方式
        String[] newWay = list.toArray(String[]::new);
    }
}
