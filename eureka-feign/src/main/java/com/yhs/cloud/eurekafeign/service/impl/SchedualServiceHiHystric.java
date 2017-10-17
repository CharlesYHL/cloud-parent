package com.yhs.cloud.eurekafeign.service.impl;

import com.yhs.cloud.eurekafeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author Charles
 * @Title: SchedualServiceHiHystric
 * @Package com.yhs.cloud.eurekafeign.service.impl
 * @Description: TODO
 * @date 2017/10/17 11:28
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
