package 面试题.java创建对象的五种方式;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CreateObjectTest2 {

    /**
     * Java对象的序列化与反序列化
     */
    public static void main(String[] args) {
        Person zhangsan = new Person("zhangsan", 30, 170);
        Person lisi = new Person("lisi", 35, 175);
        Person wangwu = new Person("wangwu", 28, 178);

        try {
            //需要一个文件输出流和对象输出流；文件输出流用于将字节输出到文件，对象输出流用于将对象输出为字节
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"));
            out.writeObject(zhangsan);
            out.writeObject(lisi);
            out.writeObject(wangwu);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"));
            Person one = (Person) in.readObject();
            Person two = (Person) in.readObject();
            Person three = (Person) in.readObject();
            System.out.println(one);
            System.out.println(two);
            System.out.println(three);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
