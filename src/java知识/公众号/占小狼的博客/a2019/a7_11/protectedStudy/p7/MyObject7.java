package java知识.公众号.占小狼的博客.a2019.a7_11.protectedStudy.p7;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-07-12 20:00
 **/
public class MyObject7 extends Test7 {
    public static void main(String[] args) {
        Test7 test = new Test7();
        //test.clone(); // Compile Error   ----- (1)
    }

    /*
        对于(1)而言，clone()方法来自于类Object，因此该clone()方法可见性为包java.lang及其子类Test7，由于类MyObject7不在此范围内，因此不满足可见性，编译不通过。
     */
}

