package com.talzoo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talzoo.model.BoardDao;
import com.talzoo.model.OnboardDto;


@Service // ComponentScan 대상
public class BoardService { 
	
	@Autowired
	BoardDao boardDao;
	
	public List<OnboardDto> listArticles() { // Business Logic을 Dto에 넣지 않기 위해서 서비스 패키지를 통해서 Dto 부름
		List<OnboardDto> articleList = boardDao.selectAllArticles();
		return articleList;
	}
	
	public void addArticle(OnboardDto onboardDto) {
		boardDao.insertArticle(onboardDto);
	}
	
	public OnboardDto viewArticle(int articleNo) {
		OnboardDto article = boardDao.selectArticle(articleNo);
		return article;
	}
	
	public void editArticle(OnboardDto onboardDto) {
		boardDao.updateArticle(onboardDto);
	}
	
	public void removeArticle(int articleNo) {
		boardDao.deleteArticle(articleNo);
	}
}