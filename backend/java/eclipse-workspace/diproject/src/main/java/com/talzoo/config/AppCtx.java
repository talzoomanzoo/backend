package com.talzoo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.talzoo.service.ChangePasswordService;
import com.talzoo.service.MemberDao;
import com.talzoo.service.MemberInfoPrinter;
import com.talzoo.service.MemberListPrinter;
import com.talzoo.service.MemberPrinter;
import com.talzoo.service.MemberRegisterService;
import com.talzoo.service.VersionPrinter;

@Configuration
public class AppCtx { // spring 설정 클래스: spring이 어떤 객체를 생성해서 품고 있을지 선언
	@Bean // configuration annotation 가지고 있는 설정 클래스 안에 bean annotation이 있으면 해당 메소드의 객체 생성하고 spring이 가지고 있음
	public MemberDao memberDao() { // spring이 관리하는 객체아이디는 메소드 이름으로
		return new MemberDao();
	}
	
	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService(memberDao()); // Singleton pattern
	}
	
	@Bean
	public ChangePasswordService changePwdSvc() {
		ChangePasswordService pwdSvc = new ChangePasswordService(); // bean은 return 해주는 객체를 하나씩 품음
		pwdSvc.setMemberDao(memberDao()); // 이미 memberDao 실행해서 객체 있으니까 실행 안하고 품고 있는 객체 사용 -- Singleton pattern (동일한 종류의 객체는 한개만)
		return pwdSvc;
	}
	
	@Bean
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}
	
	@Bean
	public MemberListPrinter listPrinter() {
		return new MemberListPrinter(memberDao(), memberPrinter());
	}
	
	@Bean
	public MemberInfoPrinter infoPrinter() {
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		infoPrinter.setMemberDao(memberDao());
		infoPrinter.setPrinter(memberPrinter());
		return infoPrinter;
	}
	
	@Bean
	public VersionPrinter versionPrinter() {
		VersionPrinter versionPrinter = new VersionPrinter();
		versionPrinter.setMajorVersion(5);
		versionPrinter.setMinorVersion(0);
		return versionPrinter;
	}
} // 다 돌면 spring은 세개의 spring bean (객체)을 품음 -- inside Spring container