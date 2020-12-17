package org.yeyeck.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaApplication {

	@Autowired
	private KafkaTemplate KafkaTemplate;

	public static void main(String[] args) {
		SpringApplication.run(KafkaApplication.class, args);
	}

	

}
