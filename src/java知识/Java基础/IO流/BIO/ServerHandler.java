package java知识.Java基础.IO流.BIO;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author GaoHangHang
 * @date 2018/07/19 22:17
 **/
public class ServerHandler implements Runnable {
    //维护一个socket成员变量，纪录传来的socket
    private Socket socket;

    public ServerHandler(Socket socket) {
        this.socket = socket;
    }

    //当前线程要执行的任务
    public void run() {
        InputStream in = null;
        try {
            in = socket.getInputStream();
            byte[] buffer = new byte[1024];
            int len = 0;
            //读取客户端的数据
            while ((len = in.read(buffer)) > 0) {
                System.out.println(new String(buffer, 0, len));
            }
            //向客户端写数据
            OutputStream out = socket.getOutputStream();
            out.write("hello everybody!".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
