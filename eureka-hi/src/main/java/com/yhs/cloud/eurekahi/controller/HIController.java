package com.yhs.cloud.eurekahi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Charles
 * @Title: HIController
 * @Package com.yhs.cloud.eurekahi.controller
 * @Description: TODO
 * @date 2017/10/16 16:38
 */
@RestController
public class HIController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hi")
    public String hi(@RequestParam String name){
        return "hi 2323 "+name+",i am from port:" +port;
    }

    @RequestMapping("/hi123")
    public String hi123(@RequestParam String name){
        return "hi123 "+name+",i am from port:" +port;
    }
}
