package com.mindstone.mindstoneapi;

import com.mindstone.mindstoneapi.component.JMS.JMSsender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MindstoneApiApplication {
	@Autowired
	private static JMSsender sender;

	public static void main(String[] args) {
		SpringApplication.run(MindstoneApiApplication.class, args);
		sender.send("Hii This is Jms");
	}

}
