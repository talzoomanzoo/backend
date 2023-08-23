package com.talzoo.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	@Pointcut("execution(* com.talzoo.concert.Performance.perform(..))") // pointcut으로 중복 발생 저지
	public void performance() {} // 가상의 메소드
	
	/*@Before("performance()") // *: return type 상관없음, (..) 인자값 상관 없음, Before: perform 메소드 시작 전에
	public void silenceCellPhone() {
		System.out.println("Silencing cell phone");
	}
	
	@Before("performance()")
	public void takeSeats() {
		System.out.println("Taking seats");
	}
	
	@AfterReturning("performance()") // return 후
	public void applause() {
		System.out.println("CLAP CLAP CLAP");
	}
	
	@AfterThrowing("performance()") // exception 발생 후
	public void demandRefund() {
		System.out.println("Demanding a refund");
	} */
	
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint jp) {
		try {
			System.out.println("Silencing cell phone");
			System.out.println("Taking seats");
			jp.proceed();
			System.out.println("CLAP CLAP CLAP");
		} catch (Throwable e) {
			// TODO: handle exception
			System.out.println("Demanding a refund");
		}
	}
}
