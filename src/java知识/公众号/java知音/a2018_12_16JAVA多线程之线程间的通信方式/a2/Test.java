package java知识.公众号.java知音.a2018_12_16JAVA多线程之线程间的通信方式.a2;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/16 19:18
 */
public class Test {
    public static void main(String[] args) {
        MyList service = new MyList();

        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
