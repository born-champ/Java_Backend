package com;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com")
public class ConfigerationDemo {
	
	@Bean(name="mgr")
	public Manager getManager() {
		System.out.println("Object Created");
		return new Manager();
	}

}
