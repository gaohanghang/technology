package java知识.公众号.Java团长.a6_15;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @author GaoHangHang
 * @date 2018/06/18 13:12
 **/
public class ResponseDemo03 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("refresh", "5");//设置refresh响应头控制浏览器每隔5秒钟刷新一次
        //1.在内存中创建一张图片
        BufferedImage image = new BufferedImage(80, 20, BufferedImage.TYPE_INT_BGR);
        //2.得到图片
        Graphics2D g = (Graphics2D) image.getGraphics();
        g.setColor(Color.WHITE);//设置图片的背景色
        g.fillRect(0, 0, 80, 20);//填充背景色
        //3.向图片上写数据
        g.setColor(Color.BLACK);

    }
}
