package java知识.Java基础.IO流.BIO;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 *
 * @author GaoHangHang
 * @date 2018/07/19 21:39
 **/
public class FirstServer {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(8080);
            System.out.println("服务器启动成功，监听端空位8080...");
            //不断的监听客户端的请求
            while (true) {
                Socket socket = server.accept();   //阻塞
                InputStream in = socket.getInputStream();
                byte[] buffer = new byte[1024];
                int len = 0;
                //读取客户端的数据
                while ((len = in.read(buffer)) > 0) {
                    System.out.println(new String(buffer, 0, len));
                }
                //向客户端写数据
                OutputStream out = socket.getOutputStream();
                out.write("hello everybofy!".getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
