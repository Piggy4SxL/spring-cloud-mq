package com.oc.sxl.rabbitmessagequeue.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author SxL
 * Created on 7/25/2018 2:10 PM.
 */
@Slf4j
@Component
public class RabbitReceive {
//    @RabbitListener(bindings = @QueueBinding(key = "a", value = @Queue("fifth"), exchange = @Exchange("testExchange")))
//    public void receiveA(String message) {
//        System.out.println("a : " + message);
//    }
//
//    @RabbitListener(bindings = @QueueBinding(key = "b", value = @Queue("forth"), exchange = @Exchange("testExchange")))
//    public void receiveB(String message) {
//        System.out.println("b : " + message);
//    }

}
