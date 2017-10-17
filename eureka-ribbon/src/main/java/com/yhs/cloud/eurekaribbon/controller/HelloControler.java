package com.yhs.cloud.eurekaribbon.controller;

import com.yhs.cloud.eurekaribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Charles
 * @Title: HelloControler
 * @Package com.yhs.cloud.eurekaribbon.controller
 * @Description: TODO
 * @date 2017/10/16 16:59
 */
@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        System.out.println("api-a开头的请求:"+name);
        return helloService.hiService(name);
    }

}
