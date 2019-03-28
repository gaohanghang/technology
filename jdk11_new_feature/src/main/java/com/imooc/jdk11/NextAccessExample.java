package com.imooc.jdk11;

import java.lang.reflect.Field;

/**
 * <h1>基于嵌套的访问控制</h1>
 */
public class NextAccessExample {

    public static class X {

        void test() throws Exception {
            Y y = new Y();
            y.y = 1;
            Field field = Y.class.getDeclaredField("y");
//            field.setAccessible(true);
            field.setInt(y, 2);
        }
    }

    private static class Y {

        private int y;
    }

    public static void main(String[] args) throws Exception {

        new X().test();
    }
}
