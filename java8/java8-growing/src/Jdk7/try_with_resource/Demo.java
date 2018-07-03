package try_with_resource;

import java.io.*;

/**
 * @author GaoHangHang
 * @date 2018/07/03 10:55
 **/
public class Demo {
    public static void main(String[] args) {
        BufferedInputStream bin = null;
        BufferedOutputStream bout = null;
        try{
            bin = new BufferedInputStream(new FileInputStream(new File("test.txt")));
            bout = new BufferedOutputStream(new FileOutputStream(new File("out.txt")));
            int b;
           while ((b = bin.read()) != -1){
               bout.write(b);
           }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (bin != null) {
                try {
                    bin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                finally {
                        if (bout != null) {
                            try {
                                bout.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                }
            }

        }
    }
}
