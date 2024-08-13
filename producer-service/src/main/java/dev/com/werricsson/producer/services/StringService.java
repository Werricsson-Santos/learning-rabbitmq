package dev.com.werricsson.producer.services;

import static main.java.constants.RabbitMQConstants.*;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@RequiredArgsConstructor
public class StringService {
	
	private final RabbitTemplate rabbitTemplate;

	public void produce(String message) {
		log.info("Received message " + message);
		rabbitTemplate.convertAndSend(EXG_NAME_MARKETPLACE, RK_PRODUCT_LOG, message);
	}
}
