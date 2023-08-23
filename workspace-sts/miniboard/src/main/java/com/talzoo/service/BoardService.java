package com.talzoo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talzoo.model.AnswerDto;
import com.talzoo.model.BoardDao;
import com.talzoo.model.OnboardDto;


@Service // ComponentScan 대상
public class BoardService { 
	
	@Autowired
	BoardDao boardDao;
	
	public List<OnboardDto> listArticles() { // Business Logic을 Dto에 넣지 않기 위해서 서비스 패키지를 통해서 Dto 부름
		List<OnboardDto> articleList = boardDao.selectArticleList();
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
	
	public void updateView(OnboardDto onboardDto) {
		// Log the service method call
	    System.out.println("updateView Service Method Called");
		boardDao.updateView(onboardDto);
	}
	
	//public PageInfo<OnboardDto> selectArticleList() {
    //    return boardDao.selectArticleList();
    //};
	
	public List<AnswerDto> listAnswers(int articleNo) {
		List<AnswerDto> answerList = boardDao.selectAnswerList(articleNo);
		return answerList;
	}
	
	
	public void addAnswer(AnswerDto answerDto) {
		boardDao.insertAnswer(answerDto);
	}
	
	public void editAnswer(AnswerDto answerDto) {
		boardDao.updateAnswer(answerDto);
	}
	
	public void removeAnswer(int answerNo) {
		boardDao.deleteAnswer(answerNo);
	}

	public void updateLike(OnboardDto onboardDto) {
		// TODO Auto-generated method stub
		boardDao.updateLike(onboardDto);
	}

	public void updateDislike(OnboardDto onboardDto) {
		// TODO Auto-generated method stub
		boardDao.updateDislike(onboardDto);
	}
}