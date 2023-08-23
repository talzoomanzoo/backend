package com.talzoo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.talzoo.spring.VersionPrinter;

@Configuration
@ComponentScan(basePackages = {"com.talzoo.spring"})
public class AppCtx { // spring 설정 클래스: spring이 어떤 객체를 생성해서 품고 있을지 선언
	/*@Bean // configuration annotation 가지고 있는 설정 클래스 안에 bean annotation이 있으면 해당 메소드의 객체 생성하고 spring이 가지고 있음
	public MemberDao memberDao() { // spring이 관리하는 객체아이디는 메소드 이름으로
		return new MemberDao();
	}
	
	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService();
	}
	
	@Bean
	public ChangePasswordService changePwdSvc() {
		ChangePasswordService pwdSvc = new ChangePasswordService(); // bean은 return 해주는 객체를 하나씩 품음
		//pwdSvc.setMemberDao(memberDao()); //autowired in class ChangePasswordService, previously nullPointerException
		return pwdSvc;
	} */
	
	/*@Bean
	@Qualifier("printer")
	public MemberPrinter memberPrinter1() {
		return new MemberPrinter();
	} */
	
	/*@Bean
	public MemberPrinter memberPrinter2() {
		return new MemberPrinter();
	} */
	
	/*@Bean
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}
	
	@Bean
	public MemberListPrinter listPrinter() {
		return new MemberListPrinter();
	}
	
	@Bean
	public MemberInfoPrinter infoPrinter() {
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		return infoPrinter;
	} */
	
	@Bean
	public VersionPrinter versionPrinter() {
		VersionPrinter versionPrinter = new VersionPrinter();
		versionPrinter.setMajorVersion(5);
		versionPrinter.setMinorVersion(0);
		return versionPrinter;
	}
} // 다 돌면 spring은 세개의 spring bean (객체)을 품음 -- inside Spring container