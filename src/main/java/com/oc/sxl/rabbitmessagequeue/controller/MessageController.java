package com.oc.sxl.rabbitmessagequeue.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SxL
 * Created on 7/25/2018 2:16 PM.
 */
@RestController
public class MessageController {
    @Autowired
    private AmqpTemplate amqpTemplate;

    @GetMapping("/sendA")
    public void sendA() {
        amqpTemplate.convertAndSend("testExchange", "a", "this is a queue.");
    }

    @GetMapping("/sendB")
    public void sendB() {
        amqpTemplate.convertAndSend("testExchange", "b", "this is b queue.");
    }
}
