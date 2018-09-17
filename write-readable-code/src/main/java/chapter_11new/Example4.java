package main.java.chapter_11new;

import java.time.LocalDate;

/**
 * 项目专有的功能
 *
 * @author: Gao HangHang
 * @date 2018/09/17
 */
public class Example4 {

    class Request {
        String param(String key){
            return "";
        }
    }

    static class Business {
        String name;
        String url;
        LocalDate created;

        public void  save() {
        }
    }

    public void part1(Request request) {
        Business business = new Business();
        business.name = request.param("name");

        //business.url = "/biz/" + ;
    }

    private String makePrettyURL(Business business) {
        return null;
    }


}
