package com.talzoo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.talzoo.model.AnswerDto;
import com.talzoo.model.OnboardDto;
import com.talzoo.model.OnboardRepository;
import com.talzoo.model.SiteUser;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.JoinType;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

@Service
public class QuestionService {
	@Autowired
	private OnboardRepository onboardRepository;
	
	Logger logger = LoggerFactory.getLogger("com.talzoo.service.QuestionService");
    
    /*public List<OnboardDto> listArticles() {
        return onboardRepository.findAll();
    }*/

    public void addArticle(OnboardDto onboardDto) {
		logger.trace("trace ==> onboardDto: " + onboardDto);
		logger.debug("debug ==> onboardDto: " + onboardDto);
		logger.info("info ==> onboardDto: " + onboardDto);
		logger.warn("warn ==> onboardDto: " + onboardDto);
		logger.error("error ==> onboardDto: " + onboardDto);
        onboardRepository.save(onboardDto);
    }

    public OnboardDto viewArticle(int articleNo) {
        return onboardRepository.findById(articleNo).orElse(null);
    }

    public void editArticle(OnboardDto onboardDto) {
		logger.trace("trace ==> onboardDto: " + onboardDto);
		logger.debug("debug ==> onboardDto: " + onboardDto);
		logger.info("info ==> onboardDto: " + onboardDto);
		logger.warn("warn ==> onboardDto: " + onboardDto);
		logger.error("error ==> onboardDto: " + onboardDto);
        onboardRepository.save(onboardDto);
    }

    public void removeArticle(int articleNo) {
		logger.trace("trace ==> articleNo: " + articleNo);
		logger.debug("debug ==> articleNo: " + articleNo);
		logger.info("info ==> articleNo: " + articleNo);
		logger.warn("warn ==> articleNo: " + articleNo);
		logger.error("error ==> articleNo: " + articleNo);
        onboardRepository.deleteById(articleNo);
    }
    
	public void updateView(OnboardDto onboardDto) {
		// Log the service method call
		onboardRepository.save(onboardDto);
	}
	
	public void updateLike(OnboardDto onboardDto) {
		// TODO Auto-generated method stub
		onboardRepository.save(onboardDto);
	}

	public void updateDislike(OnboardDto onboardDto) {
		// TODO Auto-generated method stub
		onboardRepository.save(onboardDto);
	}
	
	public Page<OnboardDto> getList(int page, String kw) {
		List<Sort.Order> sorts = new ArrayList<>();
        sorts.add(Sort.Order.desc("writeDate"));
        Pageable pageable = PageRequest.of(page, 10, Sort.by(sorts));
        Specification<OnboardDto> spec = search(kw);
        return onboardRepository.findAll(spec, pageable);
    }

	public OnboardDto getQuestion(int articleNo) {
		// TODO Auto-generated method stub
		Optional<OnboardDto> optionalQuestion = onboardRepository.findById(articleNo);
        return optionalQuestion.orElse(null);
	}
	
    private Specification<OnboardDto> search(String kw) {
        return new Specification<>() {
            private static final long serialVersionUID = 1L;
            @Override
            public Predicate toPredicate(Root<OnboardDto> q, CriteriaQuery<?> query, CriteriaBuilder cb) {
                query.distinct(true);  // 중복을 제거 
                Join<OnboardDto, SiteUser> u1 = q.join("writeId", JoinType.LEFT);
                Join<OnboardDto, AnswerDto> a = q.join("answerList", JoinType.LEFT);
                Join<AnswerDto, SiteUser> u2 = a.join("writeId", JoinType.LEFT);
                return cb.or(cb.like(q.get("title"), "%" + kw + "%"), // 제목 
                        cb.like(q.get("content"), "%" + kw + "%"),      // 내용 
                        cb.like(u1.get("username"), "%" + kw + "%"),    // 질문 작성자 
                        cb.like(a.get("content"), "%" + kw + "%"),      // 답변 내용 
                        cb.like(u2.get("username"), "%" + kw + "%"));   // 답변 작성자 
            }
        };
    }
}
