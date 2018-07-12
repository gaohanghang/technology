package 基础知识.Java基础.String为什么是不可变的;

import java.lang.reflect.Field;

/**
 * @author GaoHangHang
 * @date 2018/07/11 14:37
 **/
public class Main {
    public static void testReflection() throws  Exception {

        // 创建字符串"Hello World"，并赋给引用s
        String s = "Hello World";

        System.out.println("s=" + s);// Hello World

        // 获取String类中的value字段
        Field valueFieldOfString = String.class.getDeclaredField("value");

        // 改变valueshu属性的访问权限
        valueFieldOfString.setAccessible(true);

        // 获取s对象上的value属性的值
        char[] value = (char[]) valueFieldOfString.get(s);

        // 改变value所引用的数组中的第5个字符
        value[5] = '_';

        System.out.println("s = " + s);  //Hello_World
    }
}
