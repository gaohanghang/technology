package main.java.chapter_11new;

import java.net.URLClassLoader;
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

        business.url = "/biz/" + makePrettyURL(business);
        business.created = LocalDate.now();
        business.save();
    }

    private String makePrettyURL(Business business) {
        String urlPathName = business.name.toLowerCase();
        urlPathName = urlPathName.replaceAll("[\\.,\\']", "");
        urlPathName = urlPathName.replaceAll("[^a-z0-9]+", "-");
        if (urlPathName.charAt(0) == '-') {
            urlPathName = urlPathName.substring(1);
        }
        if (urlPathName.charAt(urlPathName.length() - 1) == '-') {
            urlPathName = urlPathName.substring(0, urlPathName.length() - 1);
        }
        return urlPathName;
    }

}
