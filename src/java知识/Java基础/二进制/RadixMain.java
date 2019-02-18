package java知识.Java基础.二进制;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2019/02/18 00:25
 */
public class RadixMain {
    public static void main(String[] args) {
        // 十进制转为其他进制
        System.out.println(Integer.toBinaryString(12));//二进制
        System.out.println(Integer.toHexString(12));//十六进制
        System.out.println(Integer.toOctalString(12));//8进制

        // 其他进制转换为十进制
        System.out.println(Integer.parseInt("111001", 2));//二进制
        System.out.println(Integer.parseInt("27", 8));//八进制
        System.out.println(Integer.parseInt("A8", 16));//十六进制
    }
}
