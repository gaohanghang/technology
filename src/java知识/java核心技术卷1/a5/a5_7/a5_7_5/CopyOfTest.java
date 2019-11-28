package java知识.java核心技术卷1.a5.a5_7.a5_7_5;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Description: This program demonstrates the use of reflection for manipulating arrays.
 * 该程序演示了如何使用反射来操作数组
 * @author: Gao Hang Hang
 * @date 2018/12/21 18:27
 */
public class CopyOfTest {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        a = (int[]) goodCopyOf(a, 10);
        System.out.println(Arrays.toString(a));

        String[] b = {"Tom", "Dick", "Harry"};
        b = (String[]) goodCopyOf(b, 10);
        System.out.println(Arrays.toString(b));
    }

    /**
     * This method attempts to grow an array by allocating a new and copying all elements.
     * 此方法尝试通过分配新数据并复制所有元素来增长数组
     */
    public static Object[] badCopyOf(Object[] a, int newlength) // not useful
    {
        Object[] newArray = new Object[newlength];
        System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newlength));
        return newArray;
    }


    /**
     * This method grows an array by allocating a new array of the same type and copying all
     */
    public static Object goodCopyOf(Object a, int newLength) {
        Class cl = a.getClass(); // 首先获得 a 数组的类对象
        if (!cl.isArray()) return null; // 确认它是一个数组
        Class componentType = cl.getComponentType(); // 使用Class类（只能定义表示数组的类对象）的getComponentType
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentType, newLength);
        System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
        return newArray;
    }
}
