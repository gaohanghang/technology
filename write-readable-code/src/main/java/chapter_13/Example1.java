package main.java.chapter_13;

import java.nio.channels.Selector;

/**
 * 清楚的描述逻辑
 *
 * @author: Gao HangHang
 * @date 2018/09/26
 */
public class Example1 {

    private boolean isAdminRequest(){
        return false;
    }

    private String noAuthorized(){
        return "authorized.html";
    }

    class Session {

        public String getAttribute(String key) {
            return "";
        }
    }
    class Document {
        String username;
    }

//    public String part1(Document document, Session session){
//        boolean isAdmin = isAdminRequest();
//        if(null != document){
//            if(!isAdmin && document.username != session.getAttribute("username")){
//                return noAuthorized();
//            }
//        } else {
//            if(!isAdmin) {
//                return noAuthorized();
//            }
//        }
//        // 渲染正常页面
//        return "biezhi.html";
//    }

    public String part2(Document document, Session session){
        boolean isAdmin = isAdminRequest();
        if(isAdmin){
            // 获取信息
        } else if(document.username.equals(session.getAttribute("username"))){
            // 获取信息
        } else {
            return noAuthorized();
        }
        // 渲染正常页面
        return "biezhi.html";
    }

}
