package org.yeyeck.amqp.configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DirectQueueConfig {
  
  // direct 模式
  @Bean
  public Queue directQueue() {
    return new Queue("direct-queue");
  }


  // fanout 模式, 创建两个 Queue
  @Bean
  public Queue fanoutQueue1() {
    return new Queue("fanout-queue-1");
  }

  @Bean
  public Queue fanoutQueue2() {
    return new Queue("fanout-queue-2");
  }

  // fanout 模式, 创建一个 FanoutExchange
  @Bean
  public FanoutExchange fanoutExchange () {
    return new FanoutExchange("fanoutExchage");
  }

  // 将两个用于 fanout 模式的 Queue 绑定到 FanoutExchange
  @Bean
  public Binding fanoutBinding1( Queue fanoutQueue1, FanoutExchange fanoutExchange) {
    return BindingBuilder.bind(fanoutQueue1).to(fanoutExchange);
  }

  @Bean
  public Binding fanoutBinding2( Queue fanoutQueue2, FanoutExchange fanoutExchange) {
    return BindingBuilder.bind(fanoutQueue2).to(fanoutExchange);
  } 


}
