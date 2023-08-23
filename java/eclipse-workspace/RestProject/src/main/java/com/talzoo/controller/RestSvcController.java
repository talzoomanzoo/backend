package com.talzoo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.talzoo.model.OnboardDto;
import com.talzoo.service.BoardService;

@RestController // RestController는 view로 가지 않음
@RequestMapping("/bit") // 공통적으로 /bit에서  먼저 시작
public class RestSvcController {
	
	@Autowired
	BoardService boardService;
	
	@Autowired
	OnboardDto onboardDto;
	
	List<OnboardDto> articleList;
	
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello REST!!";
	} // Config에서 bean객체를 생성해야 만들어짐
	
	@RequestMapping("/hello2")
	public Map<String,String> hello2() {
		Map<String, String> map = new HashMap<String,String>();
		map.put("name", "Tom");
		map.put("age", "19");
		map.put("job", "white-water");
		return map;
	} // Config에서 bean객체를 생성해야 만들어짐
	
	@GetMapping("/article/{num}") //restful한 URL
	public OnboardDto getArticle(@PathVariable("num") int articleNo) {
		onboardDto = boardService.viewArticle(articleNo);
		return onboardDto;
	}
	
	@RequestMapping("/list")
	public List<OnboardDto> getList() {
		articleList=boardService.listArticles();
		return articleList;
	}
}
