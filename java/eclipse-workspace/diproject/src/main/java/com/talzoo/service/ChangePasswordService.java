package com.talzoo.service;

import com.talzoo.model.Member;

public class ChangePasswordService {
	private MemberDao memberDao;
	
	public void changePassword(String email, String oldPwd, String newPwd) {
		Member member = memberDao.selectByEmail(email);
		if (member == null)
			throw new MemberNotFoundException();

		member.changePassword(oldPwd, newPwd);

		memberDao.update(member);
	}

	public void setMemberDao(MemberDao memberDao) { // setter를 이용한 dependency injection
		this.memberDao = memberDao;
	}
}
