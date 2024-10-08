package dev.com.werricsson.consumer.rabbitmq.consumers;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

import static main.java.constants.RabbitMQConstants.RK_PRODUCT_LOG;

@Log4j2
@Component
public class StringConsumer {

	@RabbitListener(queues = {RK_PRODUCT_LOG})
	public void consumer(String message) {
		
		log.info("Consumer received a message -> " + message);
	}
}
