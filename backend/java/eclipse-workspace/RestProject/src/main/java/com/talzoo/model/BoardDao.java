package com.talzoo.model;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BoardDao {
	private static SqlSessionFactory sessionFactory = null;

	public static SqlSessionFactory getInstance() {
		if (sessionFactory == null) {
			try {
				String resource = "mybatis-config.xml"; // mybatis 설정파일 위치
				Reader reader = Resources.getResourceAsReader(resource);
				sessionFactory = new SqlSessionFactoryBuilder().build(reader);
				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}
	
	public List<OnboardDto> selectAllArticles() {
		sessionFactory = getInstance(); //myBatis가 제공하는 것 이 세션으로 mybatis가 sql connect and disconnect
		SqlSession session = sessionFactory.openSession();
		List<OnboardDto> articleList = session.selectList("mapper.notice.selectAllArticles"); // source code 를 별도로 xml 파일 안에 저장하고 id를 가져옴
		session.close();
		return articleList; // Controller에 줌
	}
	
	public void insertArticle(OnboardDto onboardDto) { // insert하는 거니까 return type void
		sessionFactory = getInstance();
		SqlSession session = sessionFactory.openSession();
		session.insert("mapper.notice.insertArticle", onboardDto); //onboardDto를 파라미터로 넘김
		session.commit(); // 실제로 데이터 들어가고 자동으로 닫힘

	}
	
	public OnboardDto selectArticle(int articleNo) {
		sessionFactory = getInstance();
		SqlSession session = sessionFactory.openSession();
		OnboardDto article = session.selectOne("mapper.notice.selectArticle", articleNo);
		return article;
	}
	
	public void updateArticle(OnboardDto onboardDto) {
		sessionFactory = getInstance();
		SqlSession session = sessionFactory.openSession();
		session.update("mapper.notice.updateArticle", onboardDto);
		session.commit();
	}
	
	public void deleteArticle(int articleNo) {
		sessionFactory = getInstance();
		SqlSession session = sessionFactory.openSession();
		session.delete("mapper.notice.deleteArticle", articleNo);
		session.commit();
		}
}
