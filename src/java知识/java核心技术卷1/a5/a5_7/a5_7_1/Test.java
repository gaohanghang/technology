package java知识.java核心技术卷1.a5.a5_7.a5_7_1;

import java知识.java核心技术卷1.a5.a5_1_9.Employee;

import java.util.Random;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/21 11:41
 */
public class Test {

    public static void main(String[] args) throws ClassNotFoundException {
        Employee e = null;

        Class<? extends Employee> aClass = e.getClass();
        // System.out.println(e.getClass().getName() + " " + e.getName());


        Random generator = new Random();
        Class cl = generator.getClass();
        String name = cl.getName();// name is set to "java.util.Random"
        System.out.println(name);


        //Employee employee = e.getClass().newInstance();


        String s = "java.util.Random";
        //Object m = Class.forName(s).newInstance();
    }
}
