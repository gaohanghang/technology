package 基础知识.图解设计模式.第3章TeamplateMethod模式;

/**
 * @author: Gao HangHang
 * @date 2018/10/26
 */
public abstract class AbstractDisplay { // 抽象类 AbstractDisplay
    public abstract void open();        // 交给子类去实现的抽象方法 (1) open

    public abstract void print();       // 交给子类去实现的抽象方法 (2) print

    public abstract void close();       // 交给子类去实现的抽象方法 (3) close

    public final void display() {       // 本抽象类中实现的display方法
        open();                         // 首先打开
        for (int i = 0; i < 5; i++) {   // 循环调用 5 次 print.....
            print();
        }
        close();           //......最后关闭。这就是 display 方法所实现的功能
    }
}
