package java知识.Java基础.IO流.NIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

/**
 * @author GaoHangHang
 * @date 2018/07/20 10:59
 **/
public class NIOServer {

    private int port = 8000;
    private InetSocketAddress address = null;
    private Selector selector;
    public NIOServer(int port) {
        try{
            this.port = port;
            address = new InetSocketAddress(this.port);
            ServerSocketChannel server = ServerSocketChannel.open();
            server.bind(address);
            server.configureBlocking(false);
            selector = Selector.open();
            server.register(selector,SelectionKey.OP_ACCEPT);
            System.out.println("服务器启动成功："+this.port);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
