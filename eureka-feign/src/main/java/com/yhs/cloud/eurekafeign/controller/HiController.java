package com.yhs.cloud.eurekafeign.controller;

import com.yhs.cloud.eurekafeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Charles
 * @Title: HiController
 * @Package com.yhs.cloud.eurekafeign.controller
 * @Description: TODO
 * @date 2017/10/17 10:27
 */
@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        System.out.println("api-b开头的请求:"+name);
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
