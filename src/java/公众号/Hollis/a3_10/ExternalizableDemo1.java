package java.公众号.Hollis.a3_10;

import java.io.*;

/**
 * Created by hollis on 16/2/17.
 * 对一个实现了Externalizable接口的类进行序列化及反序列化
 */
public class ExternalizableDemo1 {

    public static void main(String[] args) {
        //Write Obj to file
        User1 user = new User1();
        user.setName("hollis");
        user.setAge(23);
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tempFile.txt"))){
            oos.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Read Obj from file
        File file = new File("tempFile.txt");
        try(ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(file))){
            User1 newInstance = (User1) ois.readObject();
            //output
            System.out.println(newInstance);
        } catch (IOException | ClassNotFoundException e ) {
            e.printStackTrace();
        }
    }
}
