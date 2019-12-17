package com.xiaomi.game.demo.thrift.server;

import com.xiaomi.game.demo.thrift.HelloWorld;
import com.xiaomi.game.demo.thrift.server.service.HelloWorldImpl;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;

import java.io.IOException;
import java.net.ServerSocket;

public class Main {

    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(7912);
        TServerSocket serverTransport = new TServerSocket(socket);
        HelloWorld.Processor processor = new HelloWorld.Processor(new HelloWorldImpl());
        TServer server = new TSimpleServer(processor, serverTransport);
        System.out.println("Running server...");
        // 启动thrift服务
        server.serve();
    }
}
