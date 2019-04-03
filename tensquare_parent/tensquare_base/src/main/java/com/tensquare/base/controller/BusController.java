package com.tensquare.base.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bus")
@RefreshScope    // 此注解用于刷新配置
public class BusController {
    @Value("${sms.ip}")
    private String ip;
    @RequestMapping(value = "/ip", method = RequestMethod.GET)
    public String ip() {
        return ip;
    }
}