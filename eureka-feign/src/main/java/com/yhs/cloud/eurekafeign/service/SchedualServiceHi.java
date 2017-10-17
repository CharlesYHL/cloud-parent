package com.yhs.cloud.eurekafeign.service;

import com.yhs.cloud.eurekafeign.service.impl.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Charles
 * @Title: SchedualServiceHi
 * @Package com.yhs.cloud.eurekafeign.service
 * @Description: TODO
 * @date 2017/10/17 10:22
 */
@FeignClient(value = "eureka-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
