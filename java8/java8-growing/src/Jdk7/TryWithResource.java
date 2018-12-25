import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * try-with-resource
 *
 * @author GaoHangHang
 * @date 2018/07/03 11:07
 **/
public class TryWithResource {

    public static void main(String[] args) {
        String path = ScriptEngineDemo.class.getResource("/test.js").getPath();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String str = br.readLine();
            while (null != str) {
                System.out.println(str);
                str = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
