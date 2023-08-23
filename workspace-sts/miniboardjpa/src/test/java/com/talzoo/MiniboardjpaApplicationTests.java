package com.talzoo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.talzoo.model.OnboardDto;
import com.talzoo.service.QuestionService;

@SpringBootTest
class MiniboardjpaApplicationTests {

	@Autowired
	private QuestionService questionService;
	
	@Autowired
	private OnboardDto onboardDto;
	

	@Test
	void testJpa() {
		for (int i = 1; i <= 300; i++) {
			onboardDto= new OnboardDto();
			onboardDto.setTitle(String.format("테스트 데이터입니다:[%03d]", i));
			onboardDto.setContent("내용무");
			this.questionService.addArticle(onboardDto);
		}
	}

}
