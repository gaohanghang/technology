package java知识.Java基础.异常.在Java中创建自定义异常;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 创建自定义异常
 *
 * @date 2018/11/11 5:00 PM
 */
public class Test {
    public static void main(String[] args) {

    }

    public String test(String fileName) {
        try (Scanner file = new Scanner(new File(fileName))){
            if (file.hasNextLine())
                return file.nextLine();
        }catch (FileNotFoundException e) {
            // Logging, etc
        }
        return fileName;
    }

    public String test1(String fileName) throws IncorrectFileNameException {
        try (Scanner file = new Scanner(new File(fileName))){
            if (file.hasNextLine())
                return file.nextLine();
        }catch (FileNotFoundException err) {
            if (!isCorrectFileName(fileName)){
                throw new IncorrectFileNameException("Incorrect filename : " + fileName,err);
            }
        }
        // ...
        return fileName;
    }

    public String test2(String fileName) throws IncorrectFileNameException {
        try (Scanner file = new Scanner(new File(fileName))){
            if (file.hasNextLine())
                return file.nextLine();
        }catch (FileNotFoundException err) {
            if (!isCorrectFileName(fileName)){
                throw new IncorrectFileNameException(
                        "Incorrect filename : " + fileName,err);
            }
        }catch (IllegalArgumentException err) {
            if (!containsExtension(fileName)) {
                throw new IncorrectFileExtensionException(
                        "Filename does not contain extension : " + fileName, err);            }
        }
        // ...
        return fileName;
    }


    //正确的文件名
    public boolean isCorrectFileName(String filename){
        return true;
    }

    public boolean containsExtension(String filename) {
        return true;
    }

}
