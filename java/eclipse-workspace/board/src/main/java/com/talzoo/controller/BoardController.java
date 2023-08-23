package com.talzoo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.talzoo.model.OnboardDto;
import com.talzoo.service.BoardService;

@Controller
@RequestMapping("/board") // 큰 카테고리 밑에 board로 mapping
public class BoardController {
	@Autowired
	BoardService boardService;
	
	@Autowired
	OnboardDto onboardDto;
	
	List<OnboardDto> articleList;
	
	Logger logger = LoggerFactory.getLogger("com.talzoo.controller.BoardController");
	
	@RequestMapping({"/list", "/"}) // 주소를 여러개 주기 (method 지정 안하면 default가 get)
	public String getArticleList(Model model) {
		articleList = boardService.listArticles();
		model.addAttribute("data_list", articleList); // server -> view: model
		return "list";
	}
	
	@RequestMapping({"/add"}) // get (URL 주소에 데이터 붙여보냄)으로 오든 post로 오든 둘다 받아줌
	public String writeArticle() {
		return "write";
	}
	
	@PostMapping({"/addArticle"}) // view -> server: model
	public String addArticle(@RequestParam(value="i_title") String title, @RequestParam(value="i_content") String content) {
		onboardDto.setTitle(title);
		onboardDto.setContent(content);
		onboardDto.setWrite_id("bit");
		boardService.addArticle(onboardDto);
		//return "redirect:/board/"; // redirect: --> view x , /가 들어가는 순간 context root로
		return "redirect:list"; // redirect: --> view x , /가 없으면 여기 페이지 큰 카테고리 아래/로 들어감
	}
	
	@GetMapping({"/view"})
	public ModelAndView viewArticle(@RequestParam(value="no") String articleNo) { // form에서 넘어오는 모든 건 String으로 한번 바뀜
		onboardDto=boardService.viewArticle(Integer.parseInt(articleNo)); // 따라서 integer로 바꿔줘야함
		ModelAndView mv = new ModelAndView();
		mv.setViewName("view");
		mv.addObject("article", onboardDto);
		logger.trace("trace ==> articleNo: " + articleNo);
		logger.debug("debug ==> articleNo: " + articleNo);
		logger.info("info ==> articleNo: " + articleNo);
		logger.warn("warn ==> articleNo: " + articleNo);
		logger.error("error ==> articleNo: " + articleNo);
		return mv;
	}
	
	/*@GetMapping({"/view"})
	public String viewArticle2(Model model, @RequestParam(value="no") String articleNo) { // form에서 넘어오는 모든 건 String으로 한번 바뀜
		onboardDto= boardService.viewArticle(Integer.parseInt(articleNo)); // 따라서 integer로 바꿔줘야함
		model.addAttribute("article", onboardDto); //view.jsp로 article 넘김
		return "view";
	}*/
	
	@PostMapping({"/edit"})
	public String editArticle(@RequestParam(value="articleNo") String articleNo,
			@RequestParam(value="title") String title,
			@RequestParam(value="content") String content, RedirectAttributes redirectAttr) {
		onboardDto.setArticle_no(Integer.parseInt(articleNo));
		onboardDto.setTitle(title);
		onboardDto.setContent(content);
		boardService.editArticle(onboardDto);
		redirectAttr.addAttribute("no", articleNo);
		return "redirect:view";
	}
	
	@PostMapping({"/remove"})
	public String removeArticle(@RequestParam(value="articleNo") String articleNo) {
		boardService.removeArticle(Integer.parseInt(articleNo));
		return "redirect:list";
	}
}
