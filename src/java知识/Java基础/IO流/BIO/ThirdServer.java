package java知识.Java基础.IO流.BIO;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author GaoHangHang
 * @date 2018/07/20 10:01
 **/
public class ThirdServer {
    public static void main(String[] args) {
        ServerSocket server = null;
        ExecutorService executorService = Executors.newFixedThreadPool(60);
        try {
            server = new ServerSocket(8000);
            System.out.println("服务端启动成功，监听端口为8000,等待客户端连接...");
            while (true) {
                Socket socket = server.accept();
                //使用线程池中的线程去执行每个对应的任务
                executorService.execute(new ServerHandler(socket));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
