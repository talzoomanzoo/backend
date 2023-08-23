package com.talzoo.concert;

import org.springframework.stereotype.Component;

@Component
public class IUConcert implements Performance{

	@Override
	public void perform() throws Exception{
		throw new Exception();
	}
}
