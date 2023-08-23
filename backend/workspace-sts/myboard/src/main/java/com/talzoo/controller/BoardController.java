package com.talzoo.controller;

import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public interface BoardController {
	public String getArticleList(Model model) throws Exception;
	
	public String writeArticle() throws Exception;
	
	public String addArticle(@RequestParam(value="i_title") String title, 
			@RequestParam(value="i_content") String content) throws Exception;
	
	public ModelAndView viewArticle(@RequestParam(value="no") String articleNo) throws Exception;
	
	public String editArticle(@RequestParam(value="articleNo") String articleNo,
			@RequestParam(value="title") String title,
			@RequestParam(value="content") String content, RedirectAttributes redirectAttr) throws Exception;
	
	public String removeArticle(@RequestParam(value="articleNo") String articleNo) throws Exception;
	
	public String viewImage() throws Exception;
	
	public Map<String, String> changeImage() throws Exception;
}
