package com.talzoo.service;

import java.util.Collection;
import java.util.function.Consumer;

import com.talzoo.model.Member;

public class MemberListPrinter {
	private MemberDao memberDao;
	private MemberPrinter printer;

	public MemberListPrinter(MemberDao memberDao, MemberPrinter printer) {
		this.memberDao = memberDao;
		this.printer = printer;
	}

	public void printAll() {
		Collection<Member> members = memberDao.selectAll();
		//members.forEach(m -> printer.print(m)); // member 하나 들어오면 printer메소드에 각각 보내서 찍음
		members.forEach(new Consumer<Member>() {
			@Override
			public void accept(Member m) {
				printer.print(m);
			}
	});
}
}
