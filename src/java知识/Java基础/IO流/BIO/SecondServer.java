package java知识.Java基础.IO流.BIO;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * BIO 多个Socket多线程
 *
 * @author GaoHangHang
 * @date 2018/07/19 22:13
 **/
public class SecondServer {
    public static void main(String[] args) {
        ServerSocket server = null;
        try {
            server = new ServerSocket(8000);
            System.out.println("服务器启动成功，监听端口为8000，等待客户端连接...");
            while (true) {
                Socket socket = server.accept();
                //针对每个连接创建一个线程，去处理IO操作
                new Thread(new ServerHandler(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
