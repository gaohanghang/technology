package 基础知识.Java基础.序列化;

import java.io.*;

/**
 * @author GaoHangHang
 * @date 2018/06/28 14:16
 **/
public class Test {
    public static void main(String[] args) {
        File file = new File("file"+File.separator+"out.txt");

        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream(file);
            ObjectOutputStream oos = null;
            try{
                oos = new ObjectOutputStream(fos);
                Person person = new Person("tom",22);
                System.out.println(person);
                oos.writeObject(person);
                //写入对象
                oos.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    oos.close();
                } catch (IOException e) {
                    System.out.println("oos关闭失败："+e.getMessage());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("找不到文件："+e.getMessage());
        }finally {
            try {
                fos.close();
            } catch (IOException e) {
                System.out.println("fos关闭失败："+e.getMessage());
            }
        }

        FileInputStream fis = null;
        try{
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("找不到文件："+ e.getMessage());
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println("fis关闭失败："+e.getMessage());
            }
        }

    }
}


