package 牛客网.试题广场.a替换空格;

/**
 * Created by GaoHangHang 2018-05-10 10:08
 **/
public class Main {
    public String replaceSpace(StringBuffer str) {
        return str.toString().replaceAll("\\s", "%20");
    }
}
