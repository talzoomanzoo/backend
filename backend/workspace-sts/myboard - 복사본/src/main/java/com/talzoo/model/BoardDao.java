package com.talzoo.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Mapper // mapping (이름이 mapper id와 동일하다고 알려줌)
@Repository // Db access (똑같이 component scan 대상, 대신 db -- component 써도 됨, 개념적으로 분리 - service 는 @service)
public interface BoardDao {
	public List<OnboardDto> selectAllArticles() throws DataAccessException; // DataAccessException은 DAO 에서 발생하는 모든 exception; 기존 코드 e 부터 각 메소드 내에서
	
	public void insertArticle(OnboardDto onboardDto) throws DataAccessException;
	
	public OnboardDto selectArticle(int articleNo) throws DataAccessException;
	
	public void updateArticle(OnboardDto onboardDto) throws DataAccessException;
	
	public void deleteArticle(int articleNo) throws DataAccessException;
} // 이렇게만 하면 springboot가 실제 구현객체 다 만들어줌, SqlSessionFactory 포함
