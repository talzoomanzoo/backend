package com.talzoo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.talzoo.controller.copy.HelloController;

@Configuration
public class ControllerConfig { // spring 등록용 설정 class
	
	@Bean
	public HelloController helloController() {
		return new HelloController();
	}
}
