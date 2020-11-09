package com.yeyeck.jms.jms;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class JmsSender {
    private JmsTemplate jmsTemplate;

    public JmsSender(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void sendMailMessage(Mail mail) {
        jmsTemplate.convertAndSend("jms/queue/mail", mail);
    }

    
}
