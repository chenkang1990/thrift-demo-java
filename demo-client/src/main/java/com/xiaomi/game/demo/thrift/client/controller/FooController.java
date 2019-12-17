package com.xiaomi.game.demo.thrift.client.controller;

import com.xiaomi.game.demo.thrift.People;
import com.xiaomi.game.demo.thrift.client.service.HelloWorldProxy;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/foo")
@RestController
public class FooController {

    @Autowired
    private HelloWorldProxy helloWorldProxy;

    @PostMapping(value = "/bar", produces = "application/json")
    public String createOrder(@RequestBody People people) {
        try {
            return helloWorldProxy.say(people);
        } catch (TException e) {
            e.printStackTrace();
        }
        return "";
    }
}
