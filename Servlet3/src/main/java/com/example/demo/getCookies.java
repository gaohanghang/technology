package com.example.demo;

import javax.servlet.http.HttpServletRequest;

public class getCookies {
    public static void main(String[] args) {

    }

    public static javax.servlet.http.Cookie[] getCookies(HttpServletRequest request) {
        return request.getCookies();
    }


}
