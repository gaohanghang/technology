package day01.com.atguigu.java8;

import org.junit.Test;

import java.io.PrintStream;
import java.util.function.Consumer;
import java.util.function.Supplier;

/*
    方法引用：若 Lambda 体中的内容有方法已经实现了，我们可以使用"方法引用"
            （可以理解为方法引用是 Lambda 表达式的另外一种表现形式）

    主要有三种语法格式：

    对象::实例方法名

    类::静态方法名

    类::实例方法名

 */
public class TestMethodRef {

    @Test
    public void test1(){

        //对象::实例方法名
        PrintStream ps = System.out;
        Consumer<String> con = (x) -> System.out.println(x);

        PrintStream ps1 = System.out;
        Consumer<String> con1 = ps::println;

        Consumer<String> con2 = System.out::println;
        con2.accept("abcdef");
    }

    @Test
    public void test2(){
        Employee emp = new Employee();
        Supplier<String> sup = () -> emp.getName();
        String str = sup.get();
        System.out.println(str);

        Supplier<Integer> sup2 = emp::getAge;
        Integer num = sup2.get();
        System.out.println(num);
    }
}
