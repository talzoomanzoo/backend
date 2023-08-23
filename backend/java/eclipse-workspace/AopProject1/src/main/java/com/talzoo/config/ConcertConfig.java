package com.talzoo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.talzoo.concert.Audience;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan(basePackages = {"com.talzoo.concert"})
public class ConcertConfig {
	@Bean
	public Audience audience() {
		return new Audience();
	}
}
