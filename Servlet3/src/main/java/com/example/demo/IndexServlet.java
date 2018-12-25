package com.example.demo;

import javax.servlet.AsyncContext;
import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "index", urlPatterns = {"/"}, asyncSupported = true)
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        try {
            PrintWriter out = resp.getWriter();
            out.println("servlet started.<br/>");
            out.flush();

            AsyncContext asyncContext = req.startAsync();
            asyncContext.addListener(getListener());
            asyncContext.start(new IndexThread(asyncContext));

            out.println("servlet end.<br/>");
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private AsyncListener getListener() {
        return new AsyncListener() {
            @Override
            public void onComplete(AsyncEvent asyncEvent) throws IOException {
                asyncEvent.getSuppliedResponse().getWriter().close();
                System.out.println("thread completed.");
            }

            @Override
            public void onError(AsyncEvent event) throws IOException {
                System.out.println("thread error.");
            }

            @Override
            public void onStartAsync(AsyncEvent event) throws IOException {
                System.out.println("thread started.");
            }

            @Override
            public void onTimeout(AsyncEvent event) throws IOException {
                System.out.println("thread timeout.");
            }
        };
    }
}
