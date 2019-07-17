package java知识.公众号.占小狼的博客.a2019.a7_11.protectedStudy.p33;

import java知识.公众号.占小狼的博客.a2019.a7_11.protectedStudy.p3.MyObject3;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-07-12 19:33
 **/
public class Test3 {
    public static void main(String args[]) throws CloneNotSupportedException {
        MyObject3 obj = new MyObject3();
        obj.clone();   // Compile OK     ------（1）
    }

    /*
        对于(1)而言，clone()方法来自于类Test3，
        因此其可见性为包p33及其子类MyObject3，
        而（1）正是在p33的类Test3中调用，属于同一包，编译通过。
     */
}
