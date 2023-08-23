package com.talzoo.concert;

import org.springframework.stereotype.Component;

@Component
public class PianoConcert implements Performance{

	@Override
	public void perform() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Playing piano!!!");
	}

}
