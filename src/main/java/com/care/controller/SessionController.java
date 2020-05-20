package com.care.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SessionController {
	@RequestMapping("makeSession")
	public String makeSession(HttpServletRequest request, HttpSession session) {
		//session 만드는 방법 : request에서 얻어오거나 HttpSession이라는 객체 사용
		//HttpSession session = request.getSession();
		session.setAttribute("id", "홍길동");
		session.setAttribute("age", 20);
		session.setAttribute("addr", "산골짜기");
		return "makeSession";
	}
	@RequestMapping("resultSession")
	public String resultSession() {
		return "resultSession";
	}
	@RequestMapping("delSession")
	public String delSession(HttpSession session) {
		session.removeAttribute("id");
//		session.invalidate();
		return "delSession";
	}
}
