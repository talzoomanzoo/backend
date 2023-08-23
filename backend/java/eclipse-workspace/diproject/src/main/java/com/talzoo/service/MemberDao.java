package com.talzoo.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.talzoo.model.Member;

public class MemberDao {
	private static long nextId = 0;
	
	private Map<String, Member> map = new HashMap<>(); // key: String, value: Member인 map (python dict), db 대신 dict
	// Map: interface, HashMap: map의 구현객체

	public Member selectByEmail(String email) {
		return map.get(email); // fetch value, member
	}

	public void insert(Member member) {
		member.setId(++nextId);
		map.put(member.getEmail(), member); // map.put(key, value)
	}

	public void update(Member member) {
		map.put(member.getEmail(), member);
	}
	
	public Collection<Member> selectAll(){
		return map.values();
	}
}
