package com.xiaomi.game.demo.thrift.server.service;

import com.xiaomi.game.demo.thrift.HelloWorld;
import com.xiaomi.game.demo.thrift.Order;
import com.xiaomi.game.demo.thrift.OrderService;
import org.apache.thrift.TException;

public class OrderServiceImpl implements HelloWorld.Iface {

    @Override
    public String hi(String who) throws TException {
        return null;
    }
}
