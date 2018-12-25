package java知识.Java基础.IO流.BIO;

import jdk.internal.util.xml.impl.Input;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 客户端
 *
 * @author GaoHangHang
 * @date 2018/07/19 22:06
 **/
public class FirstClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            OutputStream out = socket.getOutputStream();
            //写点东西给服务端
            out.write("hello server!I'm client".getBytes());
            out.flush();
            InputStream in = socket.getInputStream();
            byte[] buffer = new byte[1024];
            int len = 0;
            //读取服务端的数据
            while ((len = in.read(buffer)) > 0) {
                System.out.println(new String(buffer, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
