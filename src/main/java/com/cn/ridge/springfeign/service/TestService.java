package com.cn.ridge.springfeign.service;

import com.cn.ridge.springfeign.bean.ClientBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: create by wang.gf
 * Date: create at 2018/11/28
 */
@Service("testService")
public class TestService {

    @Autowired
    private FeignServiceSpringAnnotation feignServiceSpringAnnotation;
    @Autowired
    private FeignServiceFeignAnnotation feignServiceFeignAnnotation;

    public String test() {
        return feignServiceSpringAnnotation.callClient(new ClientBean("f18c94f8-4b18-4f77-bf9b-af91abc12498"));
    }

    public String test1() {
        return feignServiceFeignAnnotation.getClientString("administrator");
    }
}
