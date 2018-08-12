package com.oc.sxl.rabbitmessagequeue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RabbitMessageQueueApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitMessageQueueApplication.class, args);
    }
}
