package com.test2;

import java.util.ArrayList;
import java.util.List;

public class JConsoleTest {

    public JConsoleTest() {
        byte[] b1 = new byte[128 * 1024];
    }

    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(5000);

        System.out.println("start .. ");
        fill(1000);
    }

    private static void fill(int n) throws InterruptedException {
        List<JConsoleTest> jlist = new ArrayList<JConsoleTest>();

        for (int j = 0; j < n; j++) {
            Thread.sleep(100);
            jlist.add(new JConsoleTest());
        }
    }
}
