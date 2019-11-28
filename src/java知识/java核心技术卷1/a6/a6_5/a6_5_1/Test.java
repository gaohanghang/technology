package java知识.java核心技术卷1.a6.a6_5.a6_5_1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Random;

/**
 * @Description: This program demonstrates the use of proxies
 * @author: Gao Hang Hang
 * @date 2018/12/27 20:54
 */
public class Test {
    public static void main(String[] args) {
        Object[] elements = new Object[1000];

        // fill elements with proxies for the integers 1 ... 1000
        for (int i = 0; i < elements.length; i++) {
            Integer value = i + 1;
            InvocationHandler handler = new TraceHandler(value);
            Object proxy = Proxy.newProxyInstance(null, new Class[]{ Comparable.class }, handler);
            elements[i] = proxy;
        }

        // construct a random integer
        Integer key = new Random().nextInt(elements.length) + 1;

        // search for the key
        int result = Arrays.binarySearch(elements, key);

        // print match if found
        if (result >= 0) System.out.println(elements[result]);
    }
}

/**
 * An invocation handler that prints out the method name and parameters, then invokes the original method
 * 一个调用处理程序，它打印出方法名称和参数，然后调用原始方法
 */
class TraceHandler implements InvocationHandler {
    private Object target;

    /**
     * Constructs a TraceHandler
     * @param t the implicit parameter of the method call
     */
    public TraceHandler(Object t) {
        this.target = t;
    }

    public Object invoke(Object proxy, Method m,Object[] args) throws Throwable {
        // print implicit argument 打印隐式参数
        System.out.print(target);
        // print method name 打印方法名称
        System.out.print("." + m.getName() + "(");
        // print explicit arguments 打印显示参数
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);
                if (i < args.length - 1) System.out.print(", ");
            }
        }
        System.out.println(")");

        // invoke actual method 调用实际方法
        return m.invoke(target, args);
    }
}
