package com.mindstone.mindstoneapi.component.JMS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;

public class JMSsender {
    @Autowired
    private JmsTemplate template;

    @Value("@{spring.Jms}")
    private String queue;

    public void send(String message) {
        template.convertAndSend(queue, message);
    }
}
