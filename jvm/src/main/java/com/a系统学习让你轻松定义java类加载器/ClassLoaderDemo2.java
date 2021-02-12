package com.a系统学习让你轻松定义java类加载器;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2021-02-12 23:37
 **/
public class ClassLoaderDemo2 {

    public static void main(String[] args) throws Exception {
        File file = new File("d:/");
        URI uri = file.toURI();
        URL url = uri.toURL();

        URLClassLoader classLoader = new URLClassLoader(new URL[]{url});
        System.out.println("父类加载器：" + classLoader.getParent()); // 默认父类加载器是系统类加载器
        Class clazz = classLoader.loadClass("com.itheima.Demo");
        clazz.newInstance();
    }

}
