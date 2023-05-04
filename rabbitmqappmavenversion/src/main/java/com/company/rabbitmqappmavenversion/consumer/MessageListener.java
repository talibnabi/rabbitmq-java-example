//package com.company.rabbitmqappmavenversion.consumer;
//
//
//import com.company.rabbitmqappmavenversion.config.RabbitMqConfig;
//import com.company.rabbitmqappmavenversion.model.CustomMessage;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
//@Component
//public class MessageListener {
//
//    @RabbitListener(queues = RabbitMqConfig.QUEUE)
//    public void listener(CustomMessage customMessage) {
//        System.out.println(customMessage);
//    }
//
//}