package java知识.公众号.占小狼的博客.a2019.a7_11.protectedStudy.p22;

import java知识.公众号.占小狼的博客.a2019.a7_11.protectedStudy.p2.MyObject2;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-07-12 19:26
 **/
public class Test2 extends MyObject2 {

    public static void main(String[] args) throws CloneNotSupportedException {
        MyObject2 obj = new MyObject2();
        //obj.clone(); // Compile Error         ----（1）

        Test2 tobj = new Test2();
        tobj.clone(); // Complie OK         ----（2）
    }

    /*
        对于(1)而言，clone()方法来自类MyObject2本身，因此其可见性为包p2及MyObject2的子类，
        但在Test2中不能访问基类MyObject2的protected方法clone()，因此编译不通过；

        对于(2)而言，由于在Test2中访问的是其本身实例的从基类MyObject2继承来的的clone()，因此编译通过。
    */
}
