package java知识.公众号.占小狼的博客.a2019.a7_11.protectedStudy.p5;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-07-12 19:55
 **/
public class Test5 {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyProject5 obj = new MyProject5();
        obj.clone(); // Compile OK        ----(1)
    }

    /*
        对于(1)而言，clone()方法来自于类MyObject5，因此其可见性为包p5及其子类(此处没有子类)，而类Test5也在包p5中，因此满足可见性，编译通过。
     */
}
