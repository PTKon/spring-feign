package com.cn.ridge.springfeign.service;

import com.cn.ridge.feignConfig.config.FeignConfig;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 使用feign注解方式
 * Author: create by wang.gf
 * Date: create at 2018/11/29
 */
@FeignClient(url = "${external.client.url}", name = "${external.client.name}", configuration = FeignConfig.class)
public interface FeignServiceFeignAnnotation {
    @RequestLine("GET /rest/functionService/getFunctionsByUserId")
    String getClientString(String s);
}
