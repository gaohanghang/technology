package 基础知识.Java基础.基本数据类型;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2021-08-20 16:10
 **/
public class Demo {
    public static void main(String[] args) {
        Integer i1 = 128;
        Integer i2 = 128;
        System.out.print((i1 == i2) + "，");
        String i3 = "100";
        String i4 = "1" + new String("00");
        System.out.print((i3 == i4) + "，");
        Integer i5 = 100;
        Integer i6 = 100;
        System.out.println(i5 == i6);
    }
}
