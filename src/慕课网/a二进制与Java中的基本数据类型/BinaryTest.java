package 慕课网.a二进制与Java中的基本数据类型;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2020-05-24 01:06
 **/
public class BinaryTest {

    public static void main(String[] args) {
        /*// 二进制
        int bin = 0b1100010;
        // 八进制
        int oct = 0142;
        // 十六进制
        int hex = 0x62;
        // 十进制
        int dec = 98;
        // 前缀是数字0，不是字母O
        // 英文字母 b x 是不区分大小写的
        // 在指定进制中使用规定的数码
        // 底层存储都是二进制的形式
        // Java默认使用十进制，输出显示都是十进制的形式
        System.out.println("2:" + bin);
        System.out.println("8:" + oct);
        System.out.println("16:" + hex);
        System.out.println("10:" + dec);*/
        int num = 98;
        /*System.out.println("2:" + Integer.toBinaryString(num));
        System.out.println("8:" + Integer.toOctalString(num));
        System.out.println("16:" + Integer.toHexString(num));*/
        /*System.out.println("2:" + Integer.toString(num, 2));
        System.out.println("8:" + Integer.toString(num, 8));
        System.out.println("16:" + Integer.toString(num, 16));
        //-----------------------
        System.out.println("------------------");
        System.out.println("5:" + Integer.toString(num, 5));
        System.out.println("36:" + Integer.toString(num, 36));
        System.out.println("37:" + Integer.toString(num, 37));
        System.out.println("100:" + Integer.toString(num, 100));*/

        System.out.println(Integer.parseInt("1100010", 2));
        System.out.println(Integer.parseInt("62", 16));
        System.out.println(Integer.parseInt("2q", 36));
    }

}
