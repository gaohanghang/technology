package java知识.java核心技术.a6.a6_2.a6_3_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * lambda 表达式中捕获的变量必须实际上是最终变量(effectively final)
 * @Description: 变量作用域
 * @author: Gao Hang Hang
 * @date 2018/12/25 15:01
 */
public class Test {
    public static void main(String[] args) {
        repeatMessage("Hello", 1000); // Prints Hello every 1,000 milliseconds
    }

    // 重复消息
    public static void repeatMessage(String text, int delay) {
        ActionListener listener = event -> {
            System.out.println(text);
            Toolkit.getDefaultToolkit().beep();
        };
        new Timer(delay, listener).start();
    }

    // Variable used in lambda expression should be final or effectively final
    public static void countDown(int start, int delay) {
        ActionListener listener = event -> {
            // start--; // Error: Can't mutate captured variable
            // System.out.println(start);
        };
        new Timer(delay, listener).start();
    }

    public static void repeat(String text, int count) {
        for (int i = 1; i <= count; i++) {
            ActionListener listener = event -> {
                // System.out.println(i + ": " + text);
                    // Error: Cannot refer to changing i
            };
            new Timer(1000, listener).start();
        }
    }
}
