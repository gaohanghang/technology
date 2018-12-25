package java知识.JavaEE.Servlet;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author GaoHangHang
 * @date 2018/07/20 20:10
 **/
public class emailFormat {
    public static void main(String[] args) {

    }

    public static boolean emailFormat(String email) {
        boolean tag = true;
        final String pattern1 = "^([a-z0-9A-Z]+[-|//.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?//.)+[a-zA-Z]{2,}$";
        final Pattern pattern = Pattern.compile(pattern1);
        final Matcher mat = pattern.matcher(email);
        if (!mat.find()) {
            tag = false;
        }
        return tag;
    }
}
