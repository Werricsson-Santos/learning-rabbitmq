package dev.com.werricsson.consumer.configs;

import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.amqp.support.converter.SimpleMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

@Configuration
public class RabbitMQConfig {

    @Bean
    public MessageConverter messageConverter() {
        SimpleMessageConverter converter = new SimpleMessageConverter();
        // Adicionando a classe ProductDTO à lista de permitidos
        converter.setAllowedListPatterns(Collections.singletonList("main.java.dtos.*"));
        return converter;
    }
}
