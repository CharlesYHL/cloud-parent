package com.yhs.cloud.eurekaribbon.service;

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

    public String hiService(String name) {
        return restTemplate.getForObject("http://EUREKA-HI/hi123?name="+name,String.class);
    }
}
