package com.xiaomi.game.demo.thrift.client.controller;

import com.xiaomi.game.demo.thrift.client.service.OrderServiceProxy;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/order")
@RestController
public class OrderController {

    @Autowired
    private OrderServiceProxy orderServiceProxy;

    @GetMapping("/new")
    public String createOrder(@RequestParam("productId") String productId, @RequestParam("quanity") Integer quanity) {
        try {
            return orderServiceProxy.createOrder(productId, quanity);
        } catch (TException e) {
            e.printStackTrace();
        }
        return "";
    }
}
