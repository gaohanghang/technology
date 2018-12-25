package java知识.Java基础.JVM;

import java.util.Vector;

/**
 * @author GaoHangHang
 * @date 2018/06/27 15:04
 **/
public class Test {
    private static Vector v = new Vector();

    public void test(Vector v) {
        for (int i = 0; i < 100; i++) {
            Object o = new Object();
            v.add(o);
            o = null;
        }
    }

    public static void main(String[] args) {

    }
}
