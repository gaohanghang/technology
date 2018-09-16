package main.java.chapter_10;

/**
 * 缩小变量的作用域
 *
 * @author: Gao HangHang
 * @date 2018/09/16
 */
public class Example3 {

    public void method1() {
        String username = "abc";
        //String.format();
        System.out.println(method2(username));
    }

    public boolean method2(String username) {
        return null != username && username.length() > 6;
    }

}
