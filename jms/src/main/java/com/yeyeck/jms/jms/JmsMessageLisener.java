package com.yeyeck.jms.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class JmsMessageLisener {
    

    @JmsListener(destination = "jms/queue/mail", concurrency = "10")
    public void onMailMessageReceived(Mail mail) {
        log.info("message: {}", mail);  
    }
}
