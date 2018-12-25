package java知识.java核心技术.a5.a5_7.a5_7_5;

import java.lang.reflect.Method;

/**
 * 调用任意方法
 *
 * @Description: This program shows how to invoke methods through reflection.
 * @author: Gao Hang Hang
 * @date 2018/12/21 19:47
 */
public class MethodTableTest {
    public static void main(String[] args) throws Exception {
        // get method pointers to the square and sqrt methods
        Method square = MethodTableTest.class.getMethod("square", double.class);


    }
}
