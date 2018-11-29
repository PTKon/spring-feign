package com.cn.ridge.springfeign.service;

import com.cn.ridge.springfeign.bean.ClientBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 使用spring注解方式
 * Author: create by wang.gf
 * Date: create at 2018/11/28
 */
@FeignClient(url = "${external.url}", name = "${external.name}")
public interface FeignServiceSpringAnnotation {
    @RequestMapping(value = "/jersey-REST_war/api/spark2/pearson2", method = RequestMethod.POST)
    String callClient(@RequestBody ClientBean bean);
}
