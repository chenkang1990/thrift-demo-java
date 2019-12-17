package com.xiaomi.game.demo.thrift.server.service;

import com.xiaomi.game.demo.thrift.HelloWorld;
import com.xiaomi.game.demo.thrift.People;
import com.xiaomi.game.demo.thrift.WeekEnum;
import org.apache.thrift.TException;

public class HelloWorldImpl implements HelloWorld.Iface {

    @Override
    public String say(People people, WeekEnum weekEnum) throws TException {

        // TO Implements

        return "hello, world!";
    }

    @Override
    public String say1() throws TException {
        return "hello, world1!";
    }
}
