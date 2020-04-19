package com.wkcto.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GateWayController {

    @RequestMapping("/api/local")
    public String local() {

        System.out.println("在api gateway中执行业务逻辑处理.....");

        return "exec the api gateway.";
    }
}
