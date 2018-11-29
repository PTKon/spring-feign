package com.cn.ridge.springfeign.controller;

import com.cn.ridge.springfeign.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: create by wang.gf
 * Date: create at 2018/11/28
 */
@RestController
public class Controller {

    private TestService testService;

    @GetMapping(value = "/show")
    public String getServiceValue() {
        return testService.test();
    }

    @GetMapping(value = "/str")
    public String getString(){
        return testService.test1();
    }

    @Autowired
    public Controller(TestService testService) {
        this.testService = testService;
    }
}
