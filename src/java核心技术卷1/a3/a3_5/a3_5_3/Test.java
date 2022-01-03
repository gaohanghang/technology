package java核心技术卷1.a3.a3_5.a3_5_3;

/**
 * 强制类型转换
 */
public class Test {
    public static void main(String[] args) {
        double x = 9.997;
        int nx = (int) x;
        System.out.println(nx);

        System.out.println((int) Math.round(x));

        System.out.println((byte) 300);
    }
}
