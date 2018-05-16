package com.example.demo.controller;

import com.example.demo.pojo.Link;
import com.example.demo.pojo.People;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * Created by GaoHangHang 2018-05-09 16:29
 **/
@Controller
@RequestMapping("")
public class ParamController {


    @RequestMapping(value = "/int",method = RequestMethod.POST)
    @ResponseBody
    public String requestInt(int param) {
        return "Request successful. Post param : Int - " + param;
    }
    @RequestMapping(value="/integer", method=RequestMethod.POST)
    @ResponseBody
    public String requestInteger(Integer param) {
        return "Request successful. Post param : Integer - " + param;
    }
    //......

    @RequestMapping(value="/list", method=RequestMethod.POST)
    @ResponseBody
    public String requestList(@RequestParam("listParam[]") List<String> param) {
        return "Request successful. Post param : List<String> - " + param.toString();
    }

    @RequestMapping(value="/map", method=RequestMethod.POST)
    @ResponseBody
    public String requestList(@RequestParam Map<String, Object> param) {
        return "Request successful. Post param : Map - " + param;
    }

    @RequestMapping(value="/people", method=RequestMethod.POST)
    @ResponseBody
    public String requestPeople(@ModelAttribute People people) {
        return "Get request is successful. Post param : User Class - " + people.toString();
    }

    @RequestMapping(value="/link", method=RequestMethod.POST)
    @ResponseBody
    public String requestLink(@ModelAttribute Link link) {
        return "Get request is successful. Post param : User Class - " + link.toString();
    }

    @RequestMapping(value="/path/{key}/{value}", method=RequestMethod.POST)
    @ResponseBody
    public String requestPath(@PathVariable String key, @PathVariable String value) {
        return "Get request is successful. Path param : key - " + key + "; value - " + value;
    }

    @RequestMapping(value = "/request",method = RequestMethod.POST)
    @ResponseBody
    public String request(HttpServletRequest request , HttpServletResponse response){
        return "Get request is successful. Post param : param1 - " + request.getParameter("param1") +
                "; param2 - " + request.getParameter("param2") +
                "; param3 - " + request.getParameter("param3");


    }


}
