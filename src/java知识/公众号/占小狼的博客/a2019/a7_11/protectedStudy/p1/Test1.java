package java知识.公众号.占小狼的博客.a2019.a7_11.protectedStudy.p1;

import java知识.公众号.占小狼的博客.a2019.a7_11.protectedStudy.p11.Son11;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-07-12 19:16
 **/
public class Test1 {
    public static void main(String[] args) {
        Son1 son1 = new Son1();
        son1.f(); // Compile OK     ----（1）
        //son1.clone(); // Compile Error     ----（2）

        Son11 son11 = new Son11();
        son11.f(); // Compile OK     ----（3）
        //son11.clone(); // Compile Error     ----（4）

        /*
            f()方法从类Father1继承而来，其可见性是包p1及其子类Son1和Son11，而由于调用f()方法的类Test1所在的包也是p1，因此（1）(3)处编译通过

            其次看(2)(4)，其中的clone()方法的可见性是java.lang包及其所有子类，对于语句“son1.clone();”和“son11.clone();”，
            二者的clone()在类Son1、Son11中是可见的，但对Test1是不可见的，因此（2）(4)处编译不通过。
        */
    }
}
