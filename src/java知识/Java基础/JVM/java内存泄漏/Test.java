package java知识.Java基础.JVM.java内存泄漏;

import java.util.Vector;

/**
 * @Description: 不可达，无用对象
 * @author: Gao Hang Hang
 * @create: 2019/04/29 14:02
 */
public class Test {

    public static void main(String[] args) {
        Vector v = new Vector(10);
        for (int i = 0; i < 100; i++) {
            Object o = new Object();
            v.add(o);
            o = null;
        }
        v = null;
    }
}
