package java核心技术卷1.a6.a6_4.a6_4_3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Timer;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/27 19:22
 */
public class Test {
    public static void main(String[] args) {

    }

    public void start() {
        class TimePrinter implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                System.out.println("At the tone, the time is " + new Date());
                // if (beep) Toolkit.getDefaultToolkit().beep();
            }
        }
    }

    // ActionListener listener = new TimePrinter();
    // Timer t = new Timer(interval, listener);
    // t.start;
}
