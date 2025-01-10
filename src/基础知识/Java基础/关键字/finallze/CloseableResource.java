package 基础知识.Java基础.关键字.finallze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author Gao Hanghang
 * @version 1.0
 * @description https://www.baeldung.com/java-finalize
 * @date 2025-01-10 20:03
 **/
public class CloseableResource implements AutoCloseable{
    private BufferedReader reader;

    public CloseableResource() {
        InputStream input = this.getClass().getClassLoader().getResourceAsStream("file.txt");
        reader = new BufferedReader(new InputStreamReader(input));
    }

    public String readFirstLine() throws IOException {
        String firstLine = reader.readLine();
        return firstLine;
    }

    @Override
    public void close() {
        try {
            reader.close();
            System.out.println("Closed BufferedReader in the close method");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
