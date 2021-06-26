package java知识.Java基础.多线程.synchronized为什么是可重入的;


/**
 * 文章地址：https://www.yuque.com/gaohanghang/sgrbwh/rf57va
 */
public class Son extends Father {
    public static void main(String[] args) {
        Son son = new Son();
        son.sonDoSomeSthing();
    }
    public synchronized void sonDoSomeSthing(){
        fatherDoSomeSthing();
        System.out.println("son invoke sonDoSomeSthing");
    }
    @Override
    public synchronized void fatherDoSomeSthing() {
        System.out.println("son invoke fatherDoSomeSthing");
        super.fatherDoSomeSthing();
    }
}

