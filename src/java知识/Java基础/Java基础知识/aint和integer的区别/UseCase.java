package java知识.Java基础.Java基础知识.aint和integer的区别;

/**
 * @author GaoHangHang
 * @date 2018/08/22 20:03
 **/
public class UseCase {

    public static void main(String[] args) {
        intCinteger();
    }

    public static void intCint(){
        int i = 10;
        int j = 10;
        System.out.println(i==j);

        i = 1000;
        j = 1000;
        System.out.println(i==j);
    }

    public static void integerCinteger() {
        Integer i = 127;
        Integer j = 127;
        System.out.println(i==j);// true
        i = 128;
        j = 128;
        System.out.println(i==j);// false
        i = new Integer(127);
        j = new Integer(127);
        System.out.println(i==j);// false
    }

    public static void intCinteger() {
        int i = 128;
        Integer j = 128;
        System.out.println(i==j);
        i = 127;
        j = new Integer(127);
        System.out.println(i==j);
    }
}
