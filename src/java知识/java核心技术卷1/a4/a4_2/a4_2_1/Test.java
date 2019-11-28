package java知识.java核心技术卷1.a4.a4_2.a4_2_1;

import java.util.Date;

/**
 * @Description: 对象与对象变量
 * @author: Gao Hang Hang
 * @date 2018/12/08 11:37 AM
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(new Date());

        String s = new Date().toString();
        System.out.println(s);

        Date birthday = new Date();

        Date deadline; // deadline doesn't refer to any object

        // s = deadline.toString(); // not yet

        deadline = new Date();

        deadline = birthday;

        deadline = null;

        if (deadline != null)
            System.out.println(deadline); // runtime erroe!


    }
}
