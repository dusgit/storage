package com.naic.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan("com.naic")
@ImportResource("classpath:spring-mybatis.xml")
public class ApplicationWeb {
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationWeb.class, args);
	}
	
}
