package com.imooc.jdk11;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * <h1>动态语言 API 测试</h1>
 */
public class DynamicTest {

    public static void main(String[] args) throws Throwable {

        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodHandle mh = lookup.findStatic(
                DynamicTest.class, "test", MethodType.methodType(void.class)
        );
        mh.invokeExact();
    }

    private static void test() {

        System.out.println("hello");
    }
}
