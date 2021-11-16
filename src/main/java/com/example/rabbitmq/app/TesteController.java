package com.example.rabbitmq.app;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class TesteController {

    @Autowired
    private AmqpTemplate queueSender;

    @GetMapping
    public String send(){

        queueSender.convertAndSend("teste-exchange", "routing-key-teste", "test message");
        return "ok. done";
    }

}
