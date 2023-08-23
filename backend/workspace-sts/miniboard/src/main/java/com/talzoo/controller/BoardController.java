package com.talzoo.controller;

import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.talzoo.model.OnboardDto;

public interface BoardController {

	public String splash() throws Exception;

	public String sync1() throws Exception;

	public String sync2() throws Exception;

	public String sync3() throws Exception;

	public String planning0() throws Exception;

	public String getFaqList(Model model) throws Exception;

	// public PageInfo<> selectArticleList() throws Exception;

	public String writeFaq(OnboardDto onboardDto) throws Exception;

	public String addFaq(@RequestParam(value = "i_title") String title,
			@RequestParam(value = "i_content") String content) throws Exception;
	

	public ModelAndView viewFaq(@RequestParam(value = "articleNo") String articleNo) throws Exception;

	public String editFaq(@RequestParam(value = "articleNo") String articleNo,
			@RequestParam(value = "i_title") String title, @RequestParam(value = "i_content") String content,
			RedirectAttributes redirectAttr) throws Exception;

	public String removeFaq(@RequestParam(value = "articleNo") String articleNo) throws Exception;

	public String addAnswer(@RequestParam(value = "articleNo") String articleNo, @RequestParam(value = "ii_content")String content,
			RedirectAttributes redirectAttr) throws Exception;

	/*public String getAnswerList(String articleNo, Model model) throws Exception;*/

	public String editAnswer(@RequestParam(value = "articleNo") String articleNo, @RequestParam(value = "answerNo") String answerNo,
			@RequestParam(value = "iii_content") String content, RedirectAttributes redirectAttr) throws Exception;

	public String removeAnswer(@RequestParam(value = "articleNo") String articleNo, @RequestParam(value = "answerNo") String answerNo,
			RedirectAttributes redirectAttr) throws Exception;

	String like(@RequestParam(value = "articleNo") String articleNo, RedirectAttributes redirectAttr) throws Exception;

	String count(@RequestParam(value = "articleNo") String articleNo, RedirectAttributes redirectAttr) throws Exception;

	String dislike(@RequestParam(value = "articleNo") String articleNo, RedirectAttributes redirectAttr) throws Exception;
	
	public String showImage(Model model) throws Exception;
	
	public Map<String, String> getImage(@RequestPart(value="uploadfile") MultipartFile uploadfile) throws Exception; // RequestPart -- 멀티파트로 받음
}
