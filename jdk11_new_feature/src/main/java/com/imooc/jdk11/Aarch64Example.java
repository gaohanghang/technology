package com.imooc.jdk11;

import java.util.concurrent.TimeUnit;

/**
 * <h1>改进 Aarch64 函数</h1>
 */
public class Aarch64Example {

    @SuppressWarnings("all")
    public static void MathOnJdk11() {
        long startTime = System.nanoTime();

        for (int i = 0; i < 10000000; ++i) {

            Math.sin(i);
            Math.cos(i);
            Math.log(i);
        }

        long endTime = System.nanoTime();

        // JDK11 2068ms
        // JDK8  2110ms
        System.out.println(
                TimeUnit.NANOSECONDS.toMillis(endTime - startTime) + "ms"
        );
    }

    public static void main(String[] args) {

        MathOnJdk11();
    }
}
