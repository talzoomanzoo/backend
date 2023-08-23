package com.talzoo.controller;

import java.security.Principal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.talzoo.model.AnswerDto;
import com.talzoo.model.OnboardDto;
import com.talzoo.model.SiteUser;
import com.talzoo.service.AnswerService;
import com.talzoo.service.QuestionService;
import com.talzoo.service.UserService;


@Controller("boardController")
@RequestMapping("/grind")
public class MainController implements BoardController{
	@Autowired
    private QuestionService questionService;
	@Autowired
    private AnswerService answerService;
	@Autowired
	private UserService userService;
	
	@Autowired
	OnboardDto onboardDto;

	//@Autowired
	//AnswerDto answerDto;
	
	//List<OnboardDto> articleList;
	

	//List<AnswerDto> answerList;
	
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
	public String getFaqList(Model model, int page, String kw) throws Exception {
		//articleList = questionService.listArticles();
		Page<OnboardDto> paging = questionService.getList(page, kw);
		model.addAttribute("paging", paging);
		model.addAttribute("kw", kw);
		return "faq/faq_list";
	}
	
	@Override
	@PreAuthorize("isAuthenticated()")
	@RequestMapping({ "/question/add" })
	public String writeFaq(OnboardDto onboardDto) throws Exception {
		// TODO Auto-generated method stub
		return "faq/faq_form";
	}

	@Override
	@PreAuthorize("isAuthenticated()")
	@PostMapping({ "/question/addArticle" })
	public String addFaq(String title, String content, Principal principal) throws Exception {
		SiteUser siteUser = this.userService.getUser(principal.getName());
		logger.trace("trace ==> title: " + title);
		logger.debug("debug ==> title: " + title);
		logger.info("info ==> title: " + title);
		logger.warn("warn ==> title: " + title);
		logger.error("error ==> title: " + title);
		OnboardDto onboardDto = new OnboardDto();
		onboardDto.setTitle(title);
		onboardDto.setContent(content);
		onboardDto.setWriteId(siteUser);
		questionService.addArticle(onboardDto);
		return "redirect:list";
	}

	@Override
	@RequestMapping({ "/question/view"})
	public ModelAndView viewFaq(String articleNo) throws Exception {
		onboardDto = questionService.viewArticle(Integer.parseInt(articleNo)); // 따라서 integer로 바꿔줘야함
		List<AnswerDto>answerList = answerService.listAnswers(Integer.parseInt(articleNo));
		//Page<AnswerDto> ansPaging = this.answerService.getList(page);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("faq/faq_detail");
		mv.addObject("answer_list", answerList);
		mv.addObject("article", onboardDto);
		//mv.addObject("ansPaging", ansPaging);
		return mv;
	}

	@Override
	@PreAuthorize("isAuthenticated()")
	@PostMapping({ "/question/edit" })
	public String editFaq(String articleNo, String title, String content, RedirectAttributes redirectAttr, Principal principal)
			throws Exception {
		OnboardDto onboardDto = questionService.getQuestion(Integer.parseInt(articleNo));
		if(!onboardDto.getWriteId().getUsername().equals(principal.getName())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "수정권한이 없습니다.");
        }
		logger.trace("trace ==> title: " + title);
		logger.debug("debug ==> title: " + title);
		logger.info("info ==> title: " + title);
		logger.warn("warn ==> title: " + title);
		logger.error("error ==> title: " + title);
		onboardDto.setArticleNo(Integer.parseInt(articleNo));
		onboardDto.setTitle(title);
		onboardDto.setContent(content);
		questionService.editArticle(onboardDto);
		redirectAttr.addAttribute("articleNo", articleNo);
		return "redirect:view";
	}

	@Override
	@PreAuthorize("isAuthenticated()")
	@PostMapping({ "/question/remove" })
	public String removeFaq(String articleNo, Principal principal) throws Exception {
		OnboardDto onboardDto = questionService.getQuestion(Integer.parseInt(articleNo));
		if(!onboardDto.getWriteId().getUsername().equals(principal.getName())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "수정권한이 없습니다.");
        }
		logger.trace("trace ==> articleNo: " + articleNo);
		logger.debug("debug ==> articleNo: " + articleNo);
		logger.info("info ==> articleNo: " + articleNo);
		logger.warn("warn ==> articleNo: " + articleNo);
		logger.error("error ==> articleNo: " + articleNo);
		questionService.removeArticle(Integer.parseInt(articleNo));
		return "redirect:list";
	}
	
	@Override
	@PostMapping({"/question/count"})
	public String count(String articleNo, RedirectAttributes redirectAttr) throws Exception {
		OnboardDto onboardDto = questionService.getQuestion(Integer.parseInt(articleNo));
		onboardDto.setViewCount(onboardDto.getViewCount()+1);
		questionService.updateView(onboardDto);
		redirectAttr.addAttribute("articleNo", Integer.parseInt(articleNo));
		return "redirect:view";
	}
	
	@Override
	@GetMapping({"/question/like"})
	public String like(String articleNo, RedirectAttributes redirectAttr) throws Exception {
		OnboardDto onboardDto = questionService.getQuestion(Integer.parseInt(articleNo));
		onboardDto.setLikeCount(onboardDto.getLikeCount()+1);
		questionService.updateLike(onboardDto);
		redirectAttr.addAttribute("articleNo", Integer.parseInt(articleNo));
		return "redirect:view";
	}
	
	@Override
	@GetMapping({"/question/dislike"})
	public String dislike(String articleNo, RedirectAttributes redirectAttr) throws Exception {
		OnboardDto onboardDto = questionService.getQuestion(Integer.parseInt(articleNo));
		onboardDto.setDislikeCount(onboardDto.getDislikeCount()+1);
		questionService.updateDislike(onboardDto);
		redirectAttr.addAttribute("articleNo", Integer.parseInt(articleNo));
		return "redirect:view";
	}
	
	@Override
	@PreAuthorize("isAuthenticated()")
	@PostMapping({ "/question/remove1" })
	public String removeAnswer(String articleNo, String answerNo, RedirectAttributes redirectAttr,  Principal principal) throws Exception {
	    int answerId = Integer.parseInt(answerNo);

	    // Fetch the answer by its ID before removing it
	    AnswerDto answerDto = answerService.getAnswer(answerId);
	    if (answerDto == null) {
	        // Handle the scenario when the answer does not exist
	        // You may show an error message or redirect to a relevant page
	        return "error-page";
	    }
		if(!answerDto.getWriteId().getUsername().equals(principal.getName())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "수정권한이 없습니다.");
        }
		answerService.removeAnswer(Integer.parseInt(answerNo));
		redirectAttr.addAttribute("articleNo", Integer.parseInt(articleNo));
		return "redirect:view";
	}

	@Override
	@PreAuthorize("isAuthenticated()")
	@PostMapping({ "/question/addArticle1" })
	public String addAnswer(String articleNo, String content, RedirectAttributes redirectAttr, Principal principal) throws Exception {
		SiteUser siteUser = this.userService.getUser(principal.getName());
		logger.trace("trace ==> content: " + content);
		logger.debug("debug ==> content: " + content);
		logger.info("info ==> content: " + content);
		logger.warn("warn ==> content: " + content);
		logger.error("error ==> content: " + content);
		AnswerDto answerDto = new AnswerDto();
		answerDto.setArticleNo(Integer.parseInt(articleNo));
		answerDto.setContent(content);
		answerDto.setWriteId(siteUser);
		redirectAttr.addAttribute("articleNo", articleNo);
		answerService.addAnswer(answerDto);
		return "redirect:view";
	}
	
	@Override
	@PreAuthorize("isAuthenticated()")
	@PostMapping({ "/question/edit1" })
	public String editAnswer(String articleNo, String answerNo, String content, RedirectAttributes redirectAttr,  Principal principal) throws Exception {
		 // Fetch the existing answer from the database
        AnswerDto existingAnswer = answerService.getAnswer(Integer.parseInt(answerNo));

        if (existingAnswer == null) {
            // Handle the case when the answer does not exist
            // You may show an error message or redirect to a relevant page
            return "error-page";
        }

        if (!existingAnswer.getWriteId().getUsername().equals(principal.getName())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "수정권한이 없습니다.");
        }

        existingAnswer.setContent(content);
        answerService.editAnswer(existingAnswer);

        redirectAttr.addAttribute("articleNo", Integer.parseInt(articleNo));
        return "redirect:view";
    }
}
