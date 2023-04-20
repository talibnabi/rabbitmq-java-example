package com.company.rabbitmq;


import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class MessagePublisher {

    private final RabbitTemplate amqpTemplate;

    @PostMapping("/publish")
    public String publishMessage(@RequestBody CustomMessage customMessage) {
        customMessage.setMessageId(UUID.randomUUID().toString());
        customMessage.setMessageDate(new Date());
        amqpTemplate.convertAndSend(MQConfig.EXCHANGE, MQConfig.ROUTING_KEY, customMessage);
        return customMessage.getMessage();
    }
}
