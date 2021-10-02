package com.example.rabbitmq.app;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class AppApplication {

	@Autowired
	static OrderQueueSender orderQueueSender;

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
		orderQueueSender.send("teste do proprio programa");
	}

}
