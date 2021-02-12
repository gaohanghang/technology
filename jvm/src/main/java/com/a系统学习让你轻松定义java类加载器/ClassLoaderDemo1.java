package com.a系统学习让你轻松定义java类加载器;

import sun.net.spi.nameservice.dns.DNSNameService;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2021-02-12 17:55
 **/
public class ClassLoaderDemo1 {

    public static void main(String[] args) {
        ClassLoader classLoader = Object.class.getClassLoader();
        System.out.println("Object类的类加载器是：" + classLoader);
        System.out.println("---------------");
        ClassLoader classLoader1 = DNSNameService.class.getClassLoader();
        System.out.println("DNSNameService类的类加载器：" + classLoader1);
        System.out.println("----------------");
        ClassLoader classLoader2 = ClassLoaderDemo1.class.getClassLoader();
        System.out.println("ClassLoaderDemo1的类加载器是：" + classLoader2);

        while (classLoader2 != null){
            System.out.println(classLoader2);
            classLoader2 = classLoader2.getParent(); // 获取父类加载器
        }

        System.out.println("--------------------");
        ClassLoader classLoader3 = MyObject.class.getClassLoader();
        System.out.println(classLoader3);
    }

}
