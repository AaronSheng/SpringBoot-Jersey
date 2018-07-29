package com.aaron.mq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Aaron Sheng on 2018/7/29.
 */
@Configuration
public class RabbitQueueConfiguration {
    @Bean
    public Queue queue() {
        return new Queue("hello");
    }
}
