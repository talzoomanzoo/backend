package com.talzoo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.talzoo.service.ChangePasswordService;
import com.talzoo.service.MemberDao;
import com.talzoo.service.MemberInfoPrinter;
import com.talzoo.service.MemberListPrinter;
import com.talzoo.service.MemberPrinter;
import com.talzoo.service.MemberRegisterService;
import com.talzoo.service.VersionPrinter;

public class AppConf2 {
	@Autowired // MemberDao 타입의 memberDao식별자로 되어있는 객체가 container에 있는지 찾아라. 있으면 넣어라 Dependency Auto Injection
	private MemberDao memberDao;
	
	@Autowired
	private MemberPrinter memberPrinter;

	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService(memberDao); // Singleton pattern
	}
	
	@Bean
	public ChangePasswordService changePwdSvc() {
		ChangePasswordService pwdSvc = new ChangePasswordService(); // bean은 return 해주는 객체를 하나씩 품음
		pwdSvc.setMemberDao(memberDao); // 이미 memberDao 실행해서 객체 있으니까 실행 안하고 품고 있는 객체 사용 -- Singleton pattern (동일한 종류의 객체는 한개만)
		return pwdSvc;
	}
	
	@Bean
	public MemberListPrinter listPrinter() {
		return new MemberListPrinter(memberDao, memberPrinter);
	}
	
	@Bean
	public MemberInfoPrinter infoPrinter() {
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		infoPrinter.setMemberDao(memberDao);
		infoPrinter.setPrinter(memberPrinter);
		return infoPrinter;
	}
	
	@Bean
	public VersionPrinter versionPrinter() {
		VersionPrinter versionPrinter = new VersionPrinter();
		versionPrinter.setMajorVersion(5);
		versionPrinter.setMinorVersion(0);
		return versionPrinter;
	}
}
