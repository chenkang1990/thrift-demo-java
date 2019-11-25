package com.xiaomi.game.demo.thrift.server.service;

import com.xiaomi.game.demo.thrift.HelloWorld;
import org.apache.thrift.TException;

public class HelloWorldImpl implements HelloWorld.Iface {

    @Override
    public String hi(String who) throws TException {
        return  who + " hello world!";
    }
}
