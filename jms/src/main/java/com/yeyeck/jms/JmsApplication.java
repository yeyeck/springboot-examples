package com.yeyeck.jms;

import com.yeyeck.jms.jms.JmsSender;
import com.yeyeck.jms.jms.Mail;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JmsApplication implements CommandLineRunner{

	private JmsSender jmsSender;

	public JmsApplication(JmsSender jmsSender) {
		this.jmsSender = jmsSender;
	}
	public static void main(String[] args) {
		SpringApplication.run(JmsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Mail mail = new Mail("yeyeck@sina.cn", "test message");
		jmsSender.sendMailMessage(mail);
	}

}
