package com.cn.ridge.feignConfig.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 如果不使用spring的@RequestMapping默认注解方式，而要使用feign的注解方式，这个配置就是必须的，因为feign默认使用@RequestMapping
 * 但是，feign并不能识别@GetMapping、@PostMapping等，但是要注意的是，这个配置不能被spring的@ComponentScan扫描到，如果扫描到了，就会
 * 覆盖所有feign的配置，那样的话，本来使用@RequestMapping方式的配置就会报错。
 * Author: create by wang.gf
 * Date: create at 2018/11/29
 */
@Configuration
public class FeignConfig {
    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }
}
