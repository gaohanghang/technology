package com.a系统学习让你轻松定义java类加载器;

import java.io.*;

// 1. 继承ClassLoader
// 2. 覆盖 findClass方法
public class MyFileClassLoader extends ClassLoader {

    private String directory; // 被加载类所在的目录

    public MyFileClassLoader(String directory) { // 默认父类加载器就是系统类加载器 AppClassLoader
        this.directory = directory;
    }

    public MyFileClassLoader(ClassLoader parent, String directory) {
        super(parent);
        this.directory = directory;
    }

    // com.itheima.Demo
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            // 把类名转换为目录
            String file = directory + File.separator + name.replace(".", File.separator) + ".class"; // D:/com/itheima/Demo.class
            // 构建输入流
            InputStream in = new FileInputStream(file);
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
        MyFileClassLoader classLoader = new MyFileClassLoader("d:/");
        Class<?> clazz = classLoader.loadClass("com.itheima.Demo");
        clazz.newInstance();
    }

}
