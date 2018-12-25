package 可变参数方法;

/**
 * 可变参数方法
 * <p>
 * 如果方法的参数不确定，可以使用jdk1.5的新特性：方法的可变参数
 * int sum(int a,int b);
 * int sum(int a,int b,int c);
 * int sun(int a,int b,int...c);
 * int sum(int a,int b,int[] c);
 * <p>
 * 注意事项：
 * 一个方法只能最多只有一个是可变长参数
 * 可变长参数一定要放在方法形参的最后一个
 * 可变长参数在本质上就是一个参数数组
 * <p>
 * 同名方法只能有一个
 *
 * @author GaoHangHang
 * @date 2018/06/12 9:28
 **/
class Test2 {

    public int add(int a, int b) {
        return a + b;
    }

    public int add2(int a, int b, int c) {
        return a + b + c;
    }

    public int add3(int a, int[] b) {
        int sum = a;
        for (int i = 0; i < b.length; i++) {
            sum += b[i];
        }
        return sum;
    }

    public int add4(int a, int... b) {
        int sum = a;
        for (int i = 0; i < b.length; i++) {
            sum += b[i];
        }
        return sum;
    }

    public int add5(int... b) {
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum += b[i];
        }
        return sum;
    }
}

public class Main2 {

    public static void main(String[] args) {
        Test2 t = new Test2();
        System.out.println(t.add(2, 3));
        System.out.println(t.add2(2, 3, 4));
        System.out.println(t.add3(2, new int[]{3, 4, 5, 6, 7, 8, 9}));
        System.out.println(t.add4(2, 3, 4, 5, 6, 7, 8, 9));
    }

}
