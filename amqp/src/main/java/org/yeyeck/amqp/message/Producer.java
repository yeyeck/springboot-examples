package org.yeyeck.amqp.message;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {

  private final AmqpTemplate amqpTemplate;

  public Producer(AmqpTemplate amqpTemplate) {
    this.amqpTemplate = amqpTemplate;
  }

  public void sendMessage(String queueName, Object message) {
    amqpTemplate.convertAndSend(queueName, message);
  }
  
}
