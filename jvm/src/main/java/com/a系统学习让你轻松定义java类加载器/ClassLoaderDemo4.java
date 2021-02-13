package com.a系统学习让你轻松定义java类加载器;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2021-02-12 23:37
 **/
public class ClassLoaderDemo4 {

    public static void main(String[] args) throws Exception {
        //MyFileClassLoader classLoader1 = new MyFileClassLoader("d:/"); // 父类加载器：APPClassLoader
        //MyFileClassLoader classLoader2 = new MyFileClassLoader("d:/", classLoader1);
        //Class class1 = classLoader1.loadClass("com.itheima.Demo");
        //Class class2 = classLoader2.loadClass("com.itheima.Demo");
        //System.out.println(class1.hashCode());
        //System.out.println(class2.hashCode());

        MyFileClassLoader classLoader1 = new MyFileClassLoader("d:/"); // 父类加载器：APPClassLoader
        MyFileClassLoader classLoader2 = new MyFileClassLoader("d:/", classLoader1);
        Class class1 = classLoader1.findClass("com.itheima.Demo");
        Class class2 = classLoader2.findClass("com.itheima.Demo");
        System.out.println(class1.hashCode());
        System.out.println(class2.hashCode());
    }

}
