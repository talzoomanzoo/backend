package com.talzoo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.talzoo.model.OnboardDto;
import com.talzoo.service.BoardService;

@Controller("boardController")
@RequestMapping("/board")
public class MainController implements BoardController{

	@Autowired
	BoardService boardService;
	
	@Autowired
	OnboardDto onboardDto;
	
	List<OnboardDto> articleList;
	
	Logger logger = LoggerFactory.getLogger("com.talzoo.controller.MainController");

	@Override
	@RequestMapping({"/list", "/"})
	public String getArticleList(Model model) throws Exception {
		articleList = boardService.listArticles();
		model.addAttribute("data_list", articleList); // server -> view: model
		return "list";
	}

	@Override
	@RequestMapping({"/add"})
	public String writeArticle() throws Exception {
		// TODO Auto-generated method stub
		return "write";
	}

	@Override
	@PostMapping({"/addArticle"})
	public String addArticle(String title, String content) throws Exception {
		onboardDto.setTitle(title);
		onboardDto.setContent(content);
		onboardDto.setWrite_id("bit");
		boardService.addArticle(onboardDto);
		//return "redirect:/board/"; // redirect: --> view x , /가 들어가는 순간 context root로
		return "redirect:list"; // redirect: --> view x , /가 없으면 여기 페이지 큰 카테고리 아래/로 들어감
	}

	@Override
	@GetMapping({"/view"})
	public ModelAndView viewArticle(String articleNo) throws Exception {
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

	@Override
	@PostMapping({"/edit"})
	public String editArticle(String articleNo, String title, String content, RedirectAttributes redirectAttr)
			throws Exception {
		onboardDto.setArticle_no(Integer.parseInt(articleNo));
		onboardDto.setTitle(title);
		onboardDto.setContent(content);
		boardService.editArticle(onboardDto);
		redirectAttr.addAttribute("no", articleNo);
		return "redirect:view";
	}

	@Override
	@PostMapping({"/remove"})
	public String removeArticle(String articleNo) throws Exception {
		boardService.removeArticle(Integer.parseInt(articleNo));
		return "redirect:list";
	}

	@Override
	@GetMapping("/show")
	public String viewImage() throws Exception {
		// TODO Auto-generated method stub
		return "show";
	}

	@Override
	@PostMapping("/change")
	@ResponseBody
	public Map<String, String> changeImage() throws Exception {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		map.put("file", "/image/java.png");
		map.put("name", "java1");
		return map; // jackson-databind --> 자동으로 json 파일로 내보내줌
	}
}
