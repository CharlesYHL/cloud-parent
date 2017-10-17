package com.yhs.cloud.eurekaribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Charles
 * @Title: HelloService
 * @Package com.yhs.cloud.eurekaribbon.service
 * @Description: TODO
 * @date 2017/10/16 16:58
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://EUREKA-HI/hi?name="+name,String.class);
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
        //return restTemplate.getForObject("http://EUREKA-HI/hi?name="+name,String.class);
    }
}
