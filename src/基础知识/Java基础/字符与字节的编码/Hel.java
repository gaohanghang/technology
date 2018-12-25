package 基础知识.Java基础.字符与字节的编码;

/**
 * 当编码为GBK时
 * <p>
 * 字节长度为：9
 * 字符长度为：7
 * 系统默认编码方式：GBK
 * <p>
 * 当编码为utf-8时
 * <p>
 * 字节长度为：11
 * 字符长度为：7
 * 系统默认编码方式：UTF-8
 *
 * @author GaoHangHang
 * @date 2018/07/11 12:07
 **/
public class Hel {
    public static void main(String[] args) {
        String str = "你好hello";
        int byte_len = str.getBytes().length;
        int len = str.length();
        System.out.println("字节长度为：" + byte_len);
        System.out.println("字符长度为：" + len);
        System.out.println("系统默认编码方式：" + System.getProperty("file.encoding"));
    }
}
