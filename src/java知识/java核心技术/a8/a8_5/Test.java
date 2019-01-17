package java知识.java核心技术.a8.a8_5;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date _2019/01/08 18:15
 */
public class Test {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(111);
        list.add(222);
        Class clazz3 = Class.forName("java.util.ArrayList"); // 获取ArrayList的字节码文件
        Method m = clazz3.getMethod("add", Object.class); // 获取add() 方法，Object.class 代表任意对象类型的数据
        m.invoke(list, "Hello"); //通过反射添加字符串元素数据
        System.out.println(list); // 运行结果: [111,222, Hello]
    }
}
