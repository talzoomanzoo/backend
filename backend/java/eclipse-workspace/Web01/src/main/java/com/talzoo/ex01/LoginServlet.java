package com.talzoo.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// get 방식으로 받기
		req.setCharacterEncoding("utf-8"); // request로 들어오는 모든것을 utf-8로 encoding 하겠다
		String user = req.getParameter("user_id"); // html tag의 name attribute 기준으로 끌고 옴
		String pass = req.getParameter("user_pw");
		System.out.println(user);
		System.out.println(pass);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Servlet 초창기에 사용자 view 만든 법
		req.setCharacterEncoding("utf-8"); // request로 들어오는 모든것을 utf-8로 encoding 하겠다
		String user = req.getParameter("user_id"); // html tag의 name attribute 기준으로 끌고 옴
		String pass = req.getParameter("user_pw");

		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		String data = "<html>";
		data += "<body>";
		data += "아이디 : " + user;
		data += "<br>";
		data += "비밀번호 : " + pass;
		data += "</body>";
		data += "</html>";
		out.print(data);
	}
	
}
