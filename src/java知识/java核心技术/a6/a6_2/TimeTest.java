package java知识.java核心技术.a6.a6_2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * @Description: 接口与回调
 * @author: Gao Hang Hang
 * @date 2018/12/24 15:39
 */

// to resolve conflict with java.util.Timer
public class TimeTest {
    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();

        // construct a timer that calls the listener
        // once every 10 seconds
        Timer t = new Timer(10000, listener);
        t.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TimePrinter implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("At the tone, the time is " + new Date());
    }
}
