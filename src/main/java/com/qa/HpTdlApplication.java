package com.qa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HpTdlApplication {

	public static void main(String[] args) {
		// ctrl + shift + o - optimises imports
		ApplicationContext beanbag = SpringApplication.run(HpTdlApplication.class, args);
		
		System.out.println(beanbag.getBean("tdlGreeting", String.class));
		System.out.println("Server started at " + (beanbag.getBean("serverStart", String.class)));
		System.out.println("API endpoint information at " + (beanbag.getBean("serverInfo", String.class)));
	}	
}
