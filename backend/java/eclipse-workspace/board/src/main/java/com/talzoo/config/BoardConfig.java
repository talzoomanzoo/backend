package com.talzoo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.talzoo.controller.BoardController;
import com.talzoo.model.BoardDao;
import com.talzoo.model.OnboardDto;
import com.talzoo.service.BoardService;

@Configuration
public class BoardConfig {

	@Bean
	public OnboardDto onboardDto() {
		return new OnboardDto();
	}
	
	@Bean
	public BoardDao boarDao() {
		return new BoardDao();
	}
	
	@Bean
	public BoardService boardService() {
		return new BoardService();
	}
	
	@Bean
	public BoardController boardController() {
		return new BoardController();
	}
}
