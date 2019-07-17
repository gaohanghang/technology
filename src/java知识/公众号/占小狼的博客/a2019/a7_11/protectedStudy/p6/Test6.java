package java知识.公众号.占小狼的博客.a2019.a7_11.protectedStudy.p6;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-07-12 19:56
 **/
class MyObject6 extends Test6{}

public class Test6 {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyObject6 obj = new MyObject6();
        obj.clone();        // Compile OK   -------（1）
    }

    /*
       对于(1)而言，clone()方法来自于类Test6，因此其可见性为包p6及其子类MyObject6，而类Test6也在包p6中，因此满足可见性，编译通过。
     */
}
