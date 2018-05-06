package com.example.demo;

import javax.servlet.AsyncContext;
import java.io.PrintWriter;

public class IndexThread implements Runnable{

    private AsyncContext asyncContext;

    public IndexThread(AsyncContext asyncContext){
        this.asyncContext = asyncContext;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(5000);

            PrintWriter out = asyncContext.getResponse().getWriter();
            out.println("hello servlet3.<br/>");
            out.flush();

            asyncContext.complete();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
