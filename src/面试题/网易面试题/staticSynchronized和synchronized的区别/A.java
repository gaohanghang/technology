package 面试题.网易面试题.staticSynchronized和synchronized的区别;

public class A {

    private static boolean isTrue;

    public static synchronized void staticWrite(boolean b) {
        isTrue = b;
    }

    public static synchronized boolean staticRead() {
        return isTrue;
    }

    public synchronized void writer(boolean b) {
        isTrue = b;
    }

    public synchronized boolean read() {
        return isTrue;
    }

}
