package 面试题.网易面试题.JavaStatic初始化顺序;

public class A {

    public synchronized static void m1() {
    }

    public synchronized static void m2() {
    }

    public synchronized void m3() {
    }

    public synchronized void m4() {
    }

    public void start() {

        final A a = new A();
        final A a2 = new A();

        new Thread(new Runnable() {
            @Override
            public void run() {
                A.m1();
                a.m3();
            }
        }, "T1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                A.m1();
                A.m2();
                a.m3();
                a.m4();
                a2.m3();
            }
        }, "T2").start();

    }
}
