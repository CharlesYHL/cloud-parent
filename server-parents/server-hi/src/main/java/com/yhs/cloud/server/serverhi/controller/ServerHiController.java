package com.yhs.cloud.server.serverhi.controller;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Charles
 * @Title: ServerHiController
 * @Package com.yhs.cloud.server.serverhi.controller
 * @Description: TODO
 * @date 2017/10/18 10:43
 */
@RestController
public class ServerHiController {

    private static final Logger LOG = Logger.getLogger(ServerHiController.class.getName());

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @RequestMapping("/hi")
    public String callHome(){
        LOG.log(Level.INFO, "calling trace service-hi  ");
        return restTemplate.getForObject("http://localhost:8989/miya", String.class);
    }
    @RequestMapping("/info")
    public String info(){
        LOG.log(Level.INFO, "calling trace service-hi ");

        return "i'm service-hi";

    }


    @RequestMapping("/infothi34")
    public String infothird(@RequestParam Map uriVariables){
        LOG.log(Level.INFO, "calling trace service-hi ");
        LOG.debug("infothird=======传入参数:"+uriVariables.get("thirdName"));
        String thirdName = uriVariables.get("thirdName").toString();
        Map<String, Object> uriVariablesHi = new HashMap<>();
        uriVariablesHi.put("thirdName",thirdName);
        return restTemplate.getForObject("http://localhost:8987/intad?thirdName={thirdName}", String.class,uriVariablesHi);
        //return "i'm service-hi";

    }

    @Bean
    public AlwaysSampler defaultSampler(){
        return new AlwaysSampler();
    }
}
