package com.aaron.mq;

import com.aaron.api.pojo.Message;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Aaron Sheng on 2018/7/29.
 */
@Component
public class RabbitQueueConsumer {
    private static Logger logger = LoggerFactory.getLogger(RabbitQueueConsumer.class);

    @Autowired
    private ObjectMapper objectMapper;

    @RabbitListener(queues = "hello")
    public void consumeQueue(Message message) {
        try {
            System.out.println(objectMapper.writeValueAsString(message));
        } catch (Throwable t) {
            logger.error("consume", t);
        }
    }

    @RabbitListener(
            bindings = {
                    @QueueBinding(
                            value = @Queue(value = "welcome",durable = "true"),
                            exchange = @Exchange(value = "welcome.exchange",durable = "true"),
                            key = "welcome"
                    )
            }
    )
    public void consumeExchange(Message message) {
        try {
            System.out.println(objectMapper.writeValueAsString(message));
        } catch (Throwable t) {
            logger.error("consume", t);
        }
    }
}
