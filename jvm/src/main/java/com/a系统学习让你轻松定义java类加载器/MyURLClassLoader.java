package com.a系统学习让你轻松定义java类加载器;

import java.io.*;
import java.net.URL;

// 1. 继承ClassLoader
// 2. 覆盖 findClass方法
public class MyURLClassLoader extends ClassLoader {

    private String url;

    public MyURLClassLoader(String url) { // 默认父类加载器就是系统类加载器 AppClassLoader
        this.url = url;
    }

    public MyURLClassLoader(ClassLoader parent, String url) {
        super(parent);
        this.url = url;
    }

    // com.itheima.Demo
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            // 把类名转换为目录
            String path = url + "/" + name.replace(".", "/") + ".class"; // D:/com/itheima/Demo.class
            URL url = new URL(path);
            // 构建输入流
            InputStream in = url.openStream();
            // 构建字节输出流
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            int len = -1;
            while ((len = in.read(buf)) != -1) {
                baos.write(buf, 0, len);
            }
            byte[] data = baos.toByteArray(); // 读取到的字节码的二进制数据
            in.close();
            baos.close();
            return defineClass(name, data, 0, data.length);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws Exception {
        MyURLClassLoader classLoader = new MyURLClassLoader("http://localhost:8080/example");
        Class<?> clazz = classLoader.loadClass("com.itheima.Demo");
        clazz.newInstance();
    }

}
