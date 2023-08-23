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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.talzoo.model.AnswerDto;
import com.talzoo.model.OnboardDto;
import com.talzoo.service.BoardService;
import com.talzoo.service.FileTransferService;

@Controller("boardController")
@RequestMapping("/grind")
public class MainController implements BoardController {

	@Autowired
	BoardService boardService;

	@Autowired
	OnboardDto onboardDto;

	@Autowired
	AnswerDto answerDto;
	
	@Autowired
	FileTransferService fileTransferService;

	List<OnboardDto> articleList;

	List<AnswerDto> answerList;

	Logger logger = LoggerFactory.getLogger("com.talzoo.controller.MainController");

	@Override
	@RequestMapping({ "/splash" })
	public String splash() throws Exception {
		return "splash";
	}

	@Override
	@RequestMapping({ "/sync1" })
	public String sync1() throws Exception {
		return "sync/sync1";
	}

	@Override
	@RequestMapping({ "/sync2" })
	public String sync2() throws Exception {
		return "sync/sync2";
	}

	@Override
	@RequestMapping({ "/sync3" })
	public String sync3() throws Exception {
		return "sync/sync3";
	}

	@Override
	@RequestMapping({ "/planning" })
	public String planning0() throws Exception {
		return "planning/planning";
	}

	@Override
	@RequestMapping({ "/question/list" })
	public String getFaqList(Model model) throws Exception {
		articleList = boardService.listArticles();
		model.addAttribute("data_list", articleList); // server -> view: model
		return "faq/faq_list";
	}

	/*
	 * @Override
	 * 
	 * @RequestMapping({ "/paging" }) public ResponseEntity<PageInfo>
	 * selectArticleList() throws Exception{ try { PageInfo<OnboardDto> list =
	 * boardService.selectArticleList(); return ResponseEntity.ok(list); } catch
	 * (Exception e) { return
	 * ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); } }
	 */

	@Override
	@RequestMapping({ "/question/add" })
	public String writeFaq(OnboardDto onboardDto) throws Exception {
		// TODO Auto-generated method stub
		return "faq/faq_form";
	}

	@Override
	@PostMapping({ "/question/addArticle" })
	public String addFaq(String title, String content) throws Exception {
		onboardDto.setTitle(title);
		onboardDto.setContent(content);
		onboardDto.setWrite_id("bit");
		boardService.addArticle(onboardDto);
		// return "redirect:/board/"; // redirect: --> view x , /가 들어가는 순간 context root로
		return "redirect:list"; // redirect: --> view x , /가 없으면 여기 페이지 큰 카테고리 아래/로 들어감
	}

	@Override
	@RequestMapping({ "/question/view" })
	public ModelAndView viewFaq(String articleNo) throws Exception {
		onboardDto = boardService.viewArticle(Integer.parseInt(articleNo)); // 따라서 integer로 바꿔줘야함
		answerList = boardService.listAnswers(Integer.parseInt(articleNo));
		ModelAndView mv = new ModelAndView();
		mv.setViewName("faq/faq_detail");
		mv.addObject("article", onboardDto);
		mv.addObject("answer_list", answerList);
		logger.trace("trace ==> articleNo: " + articleNo);
		logger.debug("debug ==> articleNo: " + articleNo);
		logger.info("info ==> articleNo: " + articleNo);
		logger.warn("warn ==> articleNo: " + articleNo);
		logger.error("error ==> articleNo: " + articleNo);
		return mv;
	}
	
	@Override
	@GetMapping({"/question/count"})
	public String count(String articleNo, RedirectAttributes redirectAttr) throws Exception {
		onboardDto.setView_count(onboardDto.getView_count()+1);
		boardService.updateView(onboardDto);
		redirectAttr.addAttribute("articleNo", Integer.parseInt(articleNo));
		return "redirect:view";
	}
	
	@Override
	@GetMapping({"/question/like"})
	public String like(String articleNo, RedirectAttributes redirectAttr) throws Exception {
		onboardDto.setLike_count(onboardDto.getLike_count()+1);
		boardService.updateLike(onboardDto);
		redirectAttr.addAttribute("articleNo", Integer.parseInt(articleNo));
		return "redirect:view";
	}
	
	@Override
	@GetMapping({"/question/dislike"})
	public String dislike(String articleNo, RedirectAttributes redirectAttr) throws Exception {
		onboardDto.setDislike_count(onboardDto.getDislike_count()+1);
		boardService.updateDislike(onboardDto);
		redirectAttr.addAttribute("articleNo", Integer.parseInt(articleNo));
		return "redirect:view";
	}

	@Override
	@PostMapping({ "/question/edit" })
	public String editFaq(String articleNo, String title, String content, RedirectAttributes redirectAttr)
			throws Exception {
		onboardDto.setArticle_no(Integer.parseInt(articleNo));
		onboardDto.setTitle(title);
		onboardDto.setContent(content);
		boardService.editArticle(onboardDto);
		redirectAttr.addAttribute("articleNo", articleNo);
		return "redirect:view";
	}

	@Override
	@PostMapping({ "/question/remove" })
	public String removeFaq(String articleNo) throws Exception {
		boardService.removeArticle(Integer.parseInt(articleNo));
		return "redirect:list";
	}
	
	@Override
	@PostMapping({ "/question/remove1" })
	public String removeAnswer(String articleNo, String answerNo, RedirectAttributes redirectAttr) throws Exception {
		boardService.removeAnswer(Integer.parseInt(answerNo));
		redirectAttr.addAttribute("articleNo", Integer.parseInt(articleNo));
		return "redirect:view";
	}

	@Override
	@PostMapping({ "/question/addArticle1" })
	public String addAnswer(String articleNo, String content, RedirectAttributes redirectAttr) throws Exception {
		answerDto.setArticle_no(Integer.parseInt(articleNo));
		answerDto.setContent(content);
		answerDto.setWrite_id("bit");
		redirectAttr.addAttribute("articleNo", articleNo);
		boardService.addAnswer(answerDto);
		// return "redirect:/board/"; // redirect: --> view x , /가 들어가는 순간 context root로
		return "redirect:view"; // redirect: --> view x , /가 없으면 여기 페이지 큰 카테고리 아래/로 들어감
	}

	/*
	 * @Override
	 * 
	 * @RequestMapping({ "/question/list1" }) public String getAnswerList(String
	 * articleNo, Model model) throws Exception { answerList =
	 * boardService.listAnswers(Integer.parseInt(articleNo)); // server -> view:
	 * model return "redirect:view"; }
	 */

	@Override
	@PostMapping({ "/question/edit1" })
	public String editAnswer(String articleNo, String answerNo, String content, RedirectAttributes redirectAttr) throws Exception {
		answerDto.setAnswer_no(Integer.parseInt(answerNo));
		answerDto.setContent(content);
		boardService.editAnswer(answerDto);
		redirectAttr.addAttribute("articleNo", Integer.parseInt(articleNo));
		return "redirect:view";
	}

	@Override
	@GetMapping("/catdog")
	public String showImage(Model model) throws Exception {
		// TODO Auto-generated method stub
		return "faq/dogcat";
	}

	@Override
	@PostMapping("/upload")
	@ResponseBody // map을 json type으로 받으니까 responsebody
	public Map<String, String> getImage(MultipartFile uploadfile) throws Exception {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		// Spring -> Django -> hdf5 후 다시 돌아오기
		String fromDjango = fileTransferService.webToLocal(uploadfile);
		map.put("catordog", fromDjango);
		return map; // 9번 Spring -> client json 형식으로
	}
	

}
