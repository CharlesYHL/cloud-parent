package com.yhs.cloud.server.servermiya.controller;

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
 * @Title: ServerMiyaController
 * @Package com.yhs.cloud.server.servermiya.controller
 * @Description: TODO
 * @date 2017/10/18 10:49
 */
@RestController
public class ServerMiyaController {

    private static final Logger LOG = Logger.getLogger(ServerMiyaController.class.getName());


    @RequestMapping("/hi")
    public String home(){
        LOG.log(Level.INFO, "hi is being called");
        return "hi i'm miya!";
    }

    @RequestMapping("/miya")
    public String info(){
        LOG.log(Level.INFO, "info is being called");
        return restTemplate.getForObject("http://localhost:8988/info",String.class);
    }


    @RequestMapping("/miya2")
    public String miya2(@RequestParam Map uriVariables){
        LOG.debug("miya2=======传入参数:"+uriVariables.get("thirdName"));
        LOG.log(Level.INFO, "miya2 is being called");
        //uriVariables.put("thirdName",uriVariables.get("uriVariables"));
        String thirdName = uriVariables.get("thirdName").toString();
        Map<String, Object> uriVariablesMiya = new HashMap<>();
        uriVariablesMiya.put("thirdName",thirdName);
        return restTemplate.getForObject("http://localhost:8988/infothi34?thirdName={thirdName}",String.class,uriVariablesMiya);
    }

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
