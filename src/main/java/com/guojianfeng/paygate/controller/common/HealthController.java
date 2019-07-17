package com.guojianfeng.paygate.controller.common;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 健康检查
 * @Author guojianfeng
 * @Date 2019/07/17 00:23
 */
@RestController
@RequestMapping("health")
public class HealthController {

    @RequestMapping("check")
    public String healthCheck(){
        return "I'm alive, haha~";
    }
}
