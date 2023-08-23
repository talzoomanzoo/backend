package com.talzoo.service;

import com.talzoo.model.Member;

public class MemberInfoPrinter {
	private MemberDao memDao;
	private MemberPrinter printer;

	public void printMemberInfo(String email) {
		Member member = memDao.selectByEmail(email);
		if (member == null) {
			System.out.println("데이터 없음\n");
			return;
		}
		printer.print(member);
		System.out.println();
	}

	public void setMemberDao(MemberDao memberDao) { // setter를 이용한 DI 구현
		this.memDao = memberDao;
	}

	public void setPrinter(MemberPrinter printer) { // setter를 이용한 DI 구현
		this.printer = printer;
	}

}
