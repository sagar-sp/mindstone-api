package com.mindstone.mindstoneapi.component.JmsListener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsReceiver {
    @JmsListener(destination = "${spring.Jms}")
    public void Listener(String message) {
        System.out.println(message);
    }
}
