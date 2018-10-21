package java知识.尚学堂.java300讲.testwrappedclass.cn.bjsxt.test;

/**
 * 测试自动装箱和拆箱
 *
 * @author: Gao HangHang
 * @date 2018/10/20
 */
public class Test02 {
    public static void main(String[] args) {
        //Integer a = new Integer(1000);
        Integer a = 1000;  //jdk5.0之后. 自动装箱，编译器帮我们改进代码: Integer a = new Integer(1000);

        Integer b = 2000;
        int c = b;  //自动拆箱，编译器改进: b.intValue()

        System.out.println(c);

        Integer d = 1234;
        Integer d2 = 1234;

        System.out.println(d==d2);
        System.out.println(d.equals(d2));

        System.out.println("######################");
        Integer d3 = -123;   //[-128,127]之间的数，仍然当做基本数据类型来处理
        Integer d4 = -123;
        System.out.println(d3==d4);
        System.out.println(d3.equals(d4));

    }
}
