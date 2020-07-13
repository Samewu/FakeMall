package com.fake.mall.controller;

import com.fake.mall.service.HelloWorldService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author WJQ
 */
@Controller
public class HelloWorldController {

    @Resource
    private HelloWorldService helloWorldService;

    @ResponseBody
    @RequestMapping("/hello")
    public String helloWorld() {
        return helloWorldService.helloWorld();
    }
}
