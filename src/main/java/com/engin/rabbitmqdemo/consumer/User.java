package com.engin.rabbitmqdemo.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.engin.rabbitmqdemo.config.MessagingConfig;
import com.engin.rabbitmqdemo.dto.OrderStatus;

@Component
public class User {
	
	@RabbitListener(queues = MessagingConfig.QUEUE)
	public void consumeMessageFromQueue(OrderStatus orderStatus) {
		System.out.println("Message recieved form queue : " + orderStatus);
	}
	
}
