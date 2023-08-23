package com.talzoo.spring;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.talzoo.model.Member;

@Component("listPrinter")
public class MemberListPrinter {
	private MemberDao memberDao;
	private MemberPrinter printer;
	
	@Autowired
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	//추가
	@Autowired
	@Qualifier("printer")
	public void setMemberPrinter(MemberPrinter printer) {
		this.printer = printer;
	}
	
	public MemberListPrinter() {}
	
	//public MemberListPrinter(MemberDao memberDao, MemberPrinter printer) {
		//this.memberDao = memberDao;
		//this.printer = printer;
	//}

	public void printAll() {
		Collection<Member> members = memberDao.selectAll();
		members.forEach(m -> printer.print(m)); // member 하나 들어오면 printer메소드에 각각 보내서 찍음
	}
}
