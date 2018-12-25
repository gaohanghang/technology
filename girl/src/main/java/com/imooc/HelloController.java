package com.imooc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by ghang
 * 2018/4/5 20:16
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    /*
        @PathVariable 获取url中的数据

        @RequestParam 获取请求参数的值

        @GetMapping 组合注解
     */
    @Autowired
    private GirlProperties girlProperties;

    //    @RequestMapping(value = "/say", method = RequestMethod.GET)
    @GetMapping(value = "/say")
    public String say(@RequestParam(value = "id", required = false, defaultValue = "0") Integer myId) {
        return "id：" + myId;
//        return girlProperties.getCupSize();
    }

}
