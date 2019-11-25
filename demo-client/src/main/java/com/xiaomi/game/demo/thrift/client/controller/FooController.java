package com.xiaomi.game.demo.thrift.client.controller;

import com.xiaomi.game.demo.thrift.client.service.HelloWorldProxy;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/foo")
@RestController
public class FooController {

    @Autowired
    private HelloWorldProxy helloWorldProxy;

    @GetMapping("/bar/{who}")
    public String createOrder(@PathVariable("who") String who) {
        try {
            return helloWorldProxy.hi(who);
        } catch (TException e) {
            e.printStackTrace();
        }
        return "";
    }
}
