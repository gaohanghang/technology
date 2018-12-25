package java知识.公众号.Hollis.a3_15;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception {
        List<String> stringList = new ArrayList<>();
        stringList.add("hello");
        stringList.add("world");
        stringList.add("hollis");
        stringList.add("chuang");
        System.out.println("init StringList" + stringList);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(("stringList")));
        objectOutputStream.writeObject(stringList);

        File file = new File("stringList");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        List<String> newStringList = (List<String>) objectInputStream.readObject();
        if (file.exists()) {
            file.delete();
        }
        System.out.println("new StringList" + newStringList);
    }
}
//init StringList[hello, world, hollis, chuang]
//new StringList[hello, world, hollis, chuang]
