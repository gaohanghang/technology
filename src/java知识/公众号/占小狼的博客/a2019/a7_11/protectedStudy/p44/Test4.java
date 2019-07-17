package java知识.公众号.占小狼的博客.a2019.a7_11.protectedStudy.p44;

import java知识.公众号.java知音.a2018_12_16JAVA多线程之线程间的通信方式.MyObject;
import java知识.公众号.占小狼的博客.a2019.a7_11.protectedStudy.p4.MyObject4;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-07-12 19:53
 **/
public class Test4 {

    MyObject4 obj = new MyObject4();
    //obj.clone(); // Compile Error      -----（1）

    /*
   　　对于(1)而言，clone()方法来自于类MyObject4，因此其可见性为包p4及其子类(此处没有子类)，而类Test4却在包p44中，因此不满足可见性，编译不通过。
     */
}
