package java.公众号.Hollis.a3_10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by hollis on 16/2/17.
 * SerializableDemo1 结合SerializableDemo2说明 一个类要想被序列化必须实现Serializable接口
 */
public class SerializableDemo1 {

    public static void main(String[] args) {
        //Initializes The Object
        User1 user = new User1();
        user.setName("hollis");
        user.setAge(23);
        System.out.println(user);

        //Write Obj to File
        try (FileOutputStream fos = new FileOutputStream("tempFile.txt"); ObjectOutputStream oos = new ObjectOutputStream(
                fos)) {
            oos.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Read Obj from File
        File file = new File("tempFile.txt");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            User1 newUser = (User1)ois.readObject();
            System.out.println(newUser);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
