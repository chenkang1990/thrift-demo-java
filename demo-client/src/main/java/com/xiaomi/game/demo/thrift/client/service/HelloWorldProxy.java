package com.xiaomi.game.demo.thrift.client.service;

import com.xiaomi.game.demo.thrift.HelloWorld;
import com.xiaomi.game.demo.thrift.People;
import com.xiaomi.game.demo.thrift.WeekEnum;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldProxy {

    public String say(People people) throws TException {
        TTransport transport = new TSocket("localhost", 7912);
        TProtocol protocol = new TBinaryProtocol(transport);
        HelloWorld.Client client = new HelloWorld.Client(protocol);
        transport.open();
        String result = client.say(people, WeekEnum.Monday);
        transport.close();
        return result;
    }
}
