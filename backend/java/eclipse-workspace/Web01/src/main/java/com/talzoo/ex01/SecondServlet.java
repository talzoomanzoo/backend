package com.talzoo.ex01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Second doGet() 호출");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Second destroy() 호출");
	}

	@Override
	public void init() throws ServletException { // 해당 servlet을 최초로 요구할 때 init()호출
		// TODO Auto-generated method stub
		System.out.println("Second init() 호출");
	}
}
