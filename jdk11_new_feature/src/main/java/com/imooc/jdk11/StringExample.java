package com.imooc.jdk11;

/**
 * <h1>String 新增加的 API</h1>
 */
public class StringExample {

    public static void main(String[] args) {

        String example = "Hello, JDK11\u3000";
        String empty = "\u3000";

        System.out.println("原始字符串：" + example);

        // 对比 trim 和strip
        System.out.println("<trim -> 删除字符串的头尾空白符>: " + example.trim());
        System.out.println("<strip -> 删除字符串的头尾空白符>: " + example.strip());

        System.out.println(
                "<strip -> 删除字符串的头部空白符>: " + example.stripLeading());
        System.out.println(
                "<strip -> 删除字符串的尾部空白符>: " + example.stripTrailing());

        // 对比 isBlank 和 isEmpty
        System.out.println("<isBlank -> 是否为空或仅包含空格>: " + empty.isBlank());
        System.out.println("<isEmpty -> 是否为空或仅包含空格>: " + empty.isEmpty());

        // lines
        String lines = "hello\nworld\njdk11";
        lines.lines().forEach(System.out::println);

        System.out.println("*".repeat(50));

    }
}
