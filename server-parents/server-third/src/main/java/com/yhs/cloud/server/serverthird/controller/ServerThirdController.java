package com.yhs.cloud.server.serverthird.controller;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Charles
 * @Title: ServerThirdController
 * @Package com.yhs.cloud.server.serverthird.controller
 * @Description: TODO
 * @date 2017/10/18 11:18
 */
@RestController
public class ServerThirdController {

    private static final Logger LOG = Logger.getLogger(ServerThirdController.class.getName());

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


    @RequestMapping("/third")
    public String third(@RequestParam String thirdName ){

        Map<String, Object> uriVariables = new HashMap<>();
        LOG.log(Level.INFO, "calling trace service-third  ");
        uriVariables.put("thirdName",thirdName);
        return restTemplate.getForObject("http://localhost:8989/miya2?thirdName={thirdName}", String.class,uriVariables);
    }

    @RequestMapping("/intad")
    public String intad(@RequestParam Map uriVariables){
        LOG.debug("intad=======传入参数:"+uriVariables.get("thirdName"));
        LOG.log(Level.INFO, "calling trace service-third intad ========= ");
        return "i'm service-third:"+uriVariables.get("thirdName");
    }
}
