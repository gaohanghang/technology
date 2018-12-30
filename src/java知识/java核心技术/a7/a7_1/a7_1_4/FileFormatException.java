package java知识.java核心技术.a7.a7_1.a7_1_4;

import java.io.IOException;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/29 16:44
 */
public class FileFormatException extends IOException {
    public FileFormatException() {}
    public FileFormatException(String gripe) {
        super(gripe);
    }
}
