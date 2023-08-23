package com.talzoo.spring;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.talzoo.model.Member;


@Component
public class MemberRegisterService {
	@Autowired
	private MemberDao memberDao;
	
	public MemberRegisterService() {}
	
	//public MemberRegisterService(MemberDao memberDao) { // 생성자를 이용한 Dependency Injection (외부에서 넣음)
		//this.memberDao = memberDao;
	//}

	//private MemberDao memberDao = new MemberDao(); // dependency from MemberRegisterService object's perspective
	// 아무리 의존적이라도 이 안에서 새로운 객체를 만드는 것은 유지 보수에 좋지 않음, 따라서 위와 같이 바꿈
	
	public Long regist(RegisterRequest req) {
		Member member = memberDao.selectByEmail(req.getEmail());
		if (member != null) {
			throw new DuplicateMemberException("dup email " + req.getEmail());
		}
		Member newMember = new Member(req.getEmail(), req.getPassword(), req.getName(), LocalDateTime.now());
		memberDao.insert(newMember);
		return newMember.getId();
	}
}
