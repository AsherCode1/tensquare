package com.tensquare.rabbit.customer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "codewj")
public class Customer1 {

    @RabbitHandler
    public void getMsg(String msg){
        System.out.println("2直接模式消费消息："+msg);
    }

}
