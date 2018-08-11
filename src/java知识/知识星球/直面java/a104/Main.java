package java知识.知识星球.直面java.a104;


import org.apache.commons.io.IOUtils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author GaoHangHang
 * @date 2018/08/04 21:33
 **/
public class Main {
    public static void main(String[] args) {

        //Initializes The Object
        User1 user = new User1();
        user.setName("hollis");
        user.setAge(23);
        System.out.println(user);



        //Write Obj to File
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("tempFile"));
            oos.writeObject(user);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            IOUtils.closeQuietly();
        }
    }
}
