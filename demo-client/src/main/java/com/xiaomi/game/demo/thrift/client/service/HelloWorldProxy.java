package com.xiaomi.game.demo.thrift.client.service;

import com.xiaomi.game.demo.thrift.Order;
import com.xiaomi.game.demo.thrift.OrderService;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceProxy {

    public String createOrder(String productId, Integer quanity) throws TException {
        TTransport transport = new TSocket("localhost", 7912);
        TProtocol protocol = new TBinaryProtocol(transport);
        OrderService.Client client = new OrderService.Client(protocol);
        transport.open();

        Order order = new Order();
        order.setProductId(productId);
        order.setQuantity(quanity);
        String result = client.createOrder(order);
        transport.close();
        return result;
    }
}
