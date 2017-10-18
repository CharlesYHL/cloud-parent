package com.yhs.cloud.eureka.servergkyhi.controller;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Charles
 * @Title: ServerGkyHiController
 * @Package com.yhs.cloud.eureka.servergkyhi.controller
 * @Description: TODO
 * @date 2017/10/18 15:08
 */
@RestController
public class ServerGkyHiController {

    private static final Logger LOG = Logger.getLogger(ServerGkyHiController.class.getName());

    @Value("${server.port}")
    String port;


    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        LOG.log(Level.INFO, "calling api server-gky-hi : "+name);
        return "hi "+name+",i am from port:" +port;
    }
}
