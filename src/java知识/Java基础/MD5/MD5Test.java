package java知识.Java基础.MD5;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5 加密算法
 *
 * @date 2018/11/11 6:17 PM
 */
public class MD5Test {
    public static void main(String[] args) {

    }

    public void givenPassword_whenHashing_thenVerifying() throws NoSuchAlgorithmException {
        String hash = "35454B055CC325EA1AF2126E27707052";
        String password = "ILoveJava";

        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] digest = md.digest();
        String myHash = DatatypeConverter.printHexBinary(digest).toUpperCase();


    }
}
