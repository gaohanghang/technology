package java核心技术卷1.a6.a6_4.a6_4_6;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

/**
 * @Description: This program demonstrates anonymous inner classes.
 * 该程序演示了匿名内部类
 * @author: Gao Hang Hang
 * @date 2018/12/27 19:33
 */
public class AnonymousInnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock();
        clock.start(1000, true);

        // keep program running until user selects "Ok"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

/**
 * A clock that prints the time in regular intervals.
 * 定时打印时间的时钟。
 */
class TalkingClock{
    /**
     * @param interval the interval between messages (in milliseconds)
     * @param beep true if the clock should beep
     */
    public void start(int interval, boolean beep) {
        // ActionListener listener = new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         System.out.println("At the tone, the time is " + new Date());
        //         if (beep) Toolkit.getDefaultToolkit().beep();
        //     }
        // };
        // Timer t = new Timer(interval, listener);
        // t.start();

        Timer t = new Timer(interval, event -> {
            System.out.println("At the tone, the time is " + new Date());
            if (beep) Toolkit.getDefaultToolkit().beep();
        });
        t.start();
    }
}
