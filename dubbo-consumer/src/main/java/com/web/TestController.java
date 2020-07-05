package com.web;

import com.demoAPI.TestDemo;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: dubbo-best
 * @description:
 * @author: zxb
 * @create: 2020-07-05 21:09
 **/
@RestController
public class TestController {

    @Reference
    TestDemo demo;

    @RequestMapping("/test")
    public String test(){
        return demo.test("我是消费者！");
    }
}
