package java知识.Java基础.多线程.synchronized为什么是可重入的;

public class Father {

    public synchronized void fatherDoSomeSthing() {
        System.out.println("father invoke fatherDoSomeSthing");
    }
}
