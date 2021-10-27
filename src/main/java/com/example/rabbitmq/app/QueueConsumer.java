package com.example.rabbitmq.app;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


@Component
public class QueueConsumer {

    @RabbitListener(queues = {"${queue.name}"})
    public void receive(@Payload String fileBody) throws BusinessException {
        System.out.println("Message " + fileBody + LocalDateTime.now());

        if(Integer.parseInt(fileBody) == 1){
            throw new BusinessException("testando a excecao");
        }

    }

}