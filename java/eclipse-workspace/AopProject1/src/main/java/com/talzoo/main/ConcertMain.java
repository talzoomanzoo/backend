package com.talzoo.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.talzoo.concert.IUConcert;
import com.talzoo.concert.Performance;
import com.talzoo.concert.PianoConcert;
import com.talzoo.config.ConcertConfig;

public class ConcertMain {
	public static void main(String[] args) throws Exception{
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(ConcertConfig.class); // 직접 닫는 기능은 ApplicationContext는 없어서 AbstractApplicationContext라는 부모 클래스 사용
		// ctx: 설정 클래스 담아줌 container
		Performance performance = ctx.getBean(PianoConcert.class); //필요한 것 getBean으로 가져옴
		
		performance.perform();
		
		System.out.println("==============================================");
		
		performance = ctx.getBean(IUConcert.class);
		performance.perform();
		
		ctx.close();
	}
}
