package java知识.Java基础.Java基础知识.两个Integer比较的问题;

/**
 * @author GaoHangHang
 * @date 2018/08/20 19:16
 **/
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 150; i++) {
            Integer a = i;
            Integer b = i;
            // System.out.println(i + " " + (a == b) );
            System.out.println(a+ " " + b + " "+System.identityHashCode(a)+" " +System.identityHashCode(b));
        }
    }
}
