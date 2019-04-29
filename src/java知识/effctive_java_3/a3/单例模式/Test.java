package java知识.effctive_java_3.a3.单例模式;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

import java.io.*;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @create: 2019/04/28 20:04
 */
public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, IOException, ClassNotFoundException {
        // 反射获取实例
        //Single6 single6 = Single6.class.newInstance();
        //Single6 single6two = Single6.getInstance();
        //System.out.println(single6 + "\n" + single6two);

        String filePath = "/users/gaohanghang/tempFile.txt";
        // 反序列化获取实例
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath));

        // 将实例写入到文件中
        outputStream.writeObject(Single6.getInstance());
        // 从文件中读取出来，成为新的实例
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath));
        Single6 single = (Single6) inputStream.readObject();
        // 但是这种方法可以通过重写readResolve方法来防止,
    }


}
