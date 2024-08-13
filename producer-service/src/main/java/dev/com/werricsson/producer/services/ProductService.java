package dev.com.werricsson.producer.services;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import main.java.dtos.ProductDTO;

import static main.java.constants.RabbitMQConstants.EXG_NAME_MARKETPLACE;

import static main.java.constants.RabbitMQConstants.RK_PRODUCT_LOG;

@Log4j2
@Service
@RequiredArgsConstructor
public class ProductService {

	private final RabbitTemplate rabbitTemplate;
	
	public void createProduct(ProductDTO dto) {
		log.info("Sending a message to exchange -> " + dto.toString());
		rabbitTemplate.convertAndSend(EXG_NAME_MARKETPLACE, RK_PRODUCT_LOG, dto);
	}
}
