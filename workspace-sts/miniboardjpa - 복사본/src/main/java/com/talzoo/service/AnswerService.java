package com.talzoo.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talzoo.model.AnswerDto;
import com.talzoo.model.AnswerRepository;

@Service
public class AnswerService {
	@Autowired
	private AnswerRepository answerRepository;
	
	Logger logger = LoggerFactory.getLogger("com.talzoo.service.QuestionService");
    
    public List<AnswerDto> listAnswers(int articleNo) {
        return answerRepository.findAllByArticleNo(articleNo);
    }

    public void addAnswer(AnswerDto answerDto) {
		logger.trace("trace ==> answerDto: " + answerDto);
		logger.debug("debug ==> answerDto: " + answerDto);
		logger.info("info ==> answerDto: " + answerDto);
		logger.warn("warn ==> answerDto: " + answerDto);
		logger.error("error ==> answerDto: " + answerDto);
        answerRepository.save(answerDto);
    }

    public void editAnswer(AnswerDto answerDto) {
		logger.trace("trace ==> answerDto: " + answerDto);
		logger.debug("debug ==> answerDto: " + answerDto);
		logger.info("info ==> answerDto: " + answerDto);
		logger.warn("warn ==> answerDto: " + answerDto);
		logger.error("error ==> answerDto: " + answerDto);
        answerRepository.save(answerDto);
    }

    public void removeAnswer(int answerNo) {
        answerRepository.deleteById(answerNo);
    }

	public AnswerDto getAnswer(int answerNo) {
		// TODO Auto-generated method stub
		Optional<AnswerDto> optionalAnswer = answerRepository.findById(answerNo);
        return optionalAnswer.orElse(null);
	}
}
