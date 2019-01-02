package java知识.java核心技术.a7.a7_5.a7_5_1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2019/01/02 10:50
 */
public class Test {
    public static void main(String[] args) {
        Logger.getGlobal().info("File->Open menu item selected");
        Logger.getGlobal().setLevel(Level.OFF);
    }
}
