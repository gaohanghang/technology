package jdk8;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * Base64 增强
 *
 * @author GaoHangHang
 * @date 2018/07/03 12:01
 **/
public class Base64Demo {

    public static void main(String[] args) {
        final String text = "lets Learn Java 8!";

        final String encoded = Base64.getEncoder().encodeToString(text.getBytes(StandardCharsets.UTF_8));
        System.out.println(encoded);

        final String decoded = new String(Base64.getDecoder().decode(encoded),StandardCharsets.UTF_8);
        System.out.println(decoded);
    }
}
