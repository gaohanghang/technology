package 工作.代码学习;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * @author: Gao HangHang
 * @date 2018/09/19
 */
public class TextFileReader {

    private InputStream stream;

    public TextFileReader(InputStream stream) {
        this.stream = stream;
    }

    public String readLine() throws IOException {

        ArrayList<Byte> line = new ArrayList<>();
        while (true) {
            int b = stream.read();
            if (b == -1) {
                break;
            }
            if (b == '\n') {
                break;
            } else {
                line.add((byte) b);
            }
        }

        byte[] lineData = new byte[line.size()];
        for (int i = 0; i < line.size() - 1; i++) {
            lineData[i] = line.get(i);
        }

        return new String(lineData, "utf-8").trim();
    }

}
