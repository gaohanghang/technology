package com.imooc.jdk11;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * <h1>Lambda 参数的本地变量语法</h1>
 */
public class LocalVarExample {

    private static void lambdaInJava8(){

        // 参数列表, ->, 函数体
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("before java8");
            }
        }).start();

        new Thread(() -> System.out.println("before java8")).start();

        List<String> list = Arrays.asList("java8", "jdk8", "1.8");

        list.forEach( w -> {
            System.out.println("lambda in java8");
            System.out.println(w);
        });
    }

    /**
     * <h2>Java10 新特性: 局部变量类型推断</h2>
     */
    private static void varInJava10() {

        int var = 10;

        var i = 10;     // int
        var str = "java10";         // String

        var list1 = new ArrayList<String>(); // ArrayList<String>
        var map = Map.of(1, "a", 2, "b");

        for (var entry : map.entrySet()) {
            System.out.println(entry);
        }

//        i = "abc";

//        var a;
    }

    /**
     * <h2>Java11 新特性：Lambda 表达式可以使用 var来表示变量</h2>
     */
    private static void labmdaWithVarInJava11() {

        List<Integer> nums = Arrays.asList(8, 7, 9);

        nums.sort((Integer s1, Integer s2) -> {
            if (s1.equals(s2)) {
                return 0;
            } else {
                return s1 > s2 ? 1 : -1;
            }
        });

        nums.sort((var s1, var s2) -> {
            if (s1.equals(s2)) {
                return 0;
            } else {
                return s1 > s2 ? 1 : -1;
            }
        });

        System.out.println(nums);

        //  (var x, y) -> x.pro(y)
        //  (var x, int y) -> x.pro(y)
    }

    class ErrorUseVar {

//        var i = 10;     // 不是局部变量，不允许
//
//        var f1(var str) {
//            return 10;
//        }
    }

    public static void main(String[] args) {

        lambdaInJava8();
        varInJava10();
        labmdaWithVarInJava11();
    }
}
