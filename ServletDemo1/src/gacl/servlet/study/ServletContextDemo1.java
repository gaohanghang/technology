package gacl.servlet.study;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletContextDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String data = "xdp_gacl";
        /**
         * ServletConfig对象中维护了ServletContext对象的引用，开发人员在编写servlet时，
         * 可以通过ServletConfig.getServletContext方法获得ServletContext兑现后果
         */
    }
}
