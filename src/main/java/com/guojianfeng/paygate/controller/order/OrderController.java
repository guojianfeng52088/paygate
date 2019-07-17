package com.guojianfeng.paygate.controller.order;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Description 统一下单接口
 * @Author pc
 * @Date 2019/07/17 21:59
 */
@RestController
@RequestMapping("create")
public class OrderController {

    /**
      * @Description 统一创建订单接口
      * @Author guojianfeng
      * @Date 2019/07/17 22:01
      * @param map 业务订单参数
      * @Return
      */
    @RequestMapping("businessOrder")
    public String createOrder(@RequestParam Map<String, String> map){
        return "统一创建订单接口";
    }


    /**
      * @Description 充值订单接口
      * @Author guojianfeng
      * @Date 2019/07/17 22:03
      * @param map 充值订单参数
      * @Return
      */
    @RequestMapping("rechargeOrder")
    public String crerateRecharge(@RequestParam Map<String, String> map){
        return "充值业务下单接口";
    }
}
