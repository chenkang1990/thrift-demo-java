package com.xiaomi.game.demo.thrift.client.service;

import com.xiaomi.game.demo.thrift.HelloWorld;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldProxy {

    public String hi(String who) throws TException {
        TTransport transport = new TSocket("localhost", 7912);
        TProtocol protocol = new TBinaryProtocol(transport);
        HelloWorld.Client client = new HelloWorld.Client(protocol);
        transport.open();
        String result = client.hi(who);
        transport.close();
        return result;
    }
}
