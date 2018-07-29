package java知识.Java基础.IO流.IO流的关闭;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author GaoHangHang
 * @date 2018/07/22 12:09
 **/
public class CloseIOStream {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;
        try {
            // ...
        }
        finally {
            if (is != null)
                try{
                    is.close();
                }
                catch (IOException e) {}

            if (os != null)
                try{
                    os.close();
                }
                catch (IOException e){}
        }
    }
}
