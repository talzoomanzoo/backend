package com.talzoo.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends JpaRepository<AnswerDto,Integer>{
	List<AnswerDto> findAllByArticleNo(int articleNo);
}
