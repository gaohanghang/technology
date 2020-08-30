package 基础知识.网络编程.demo02.a2;

import java.io.*;
import java.net.Socket;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2020-08-30 17:47
 **/
public class TCPClient {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/gaohanghang/IdeaProjects/technology/src/基础知识/网络编程/web/img/1.jpg");
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream os = socket.getOutputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            os.write(bytes, 0, len);
        }

        /*
            解决:上传完文件,给服务器写一个结束标记
            void shutdownOutput() 禁用此套接字的输出流。
            对于 TCP 套接字，任何以前写入的数据都将被发送，并且后跟 TCP 的正常连接终止序列。
         */
        socket.shutdownOutput();

        InputStream is = socket.getInputStream();
        while ((len = is.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }

        fis.close();
        socket.close();
    }

}
