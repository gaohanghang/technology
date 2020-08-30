package 基础知识.网络编程.demo01.a2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2020-08-30 17:33
 **/
public class TCPServer {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0 , len));
        OutputStream os = socket.getOutputStream();
        os.write("收到谢谢".getBytes());
        socket.close();
        server.close();
    }

}
