package com.care.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookieController {
	@RequestMapping("cookie")
	public String myCookie(HttpServletResponse response, 
			@CookieValue(value="myCookie", required=false) Cookie cook,
			HttpServletRequest request) {
			
		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for(Cookie c : cookies) {
				System.out.println(c.getName() + " : " + c.getValue());
			}
		}
		System.out.println("cook : " + cook);
		Cookie cookie = new Cookie("myCookie", "쿠키생성");
		cookie.setMaxAge(5);
		response.addCookie(cookie);
		return "cookie";
	}
	
	@RequestMapping("cookie02")
	public String myCookie(HttpServletResponse response, Model model,
			@CookieValue(value="myCookie", required=false) Cookie cook) {
		
		if(cook != null) {
			model.addAttribute("cook", cook.getValue());
			
		}
		System.out.println("==================="+cook);
		return "cookie02";
	}
	
	@RequestMapping("popup")
	public String popup() {
		return "popup";
	}
	
	@RequestMapping("cookieChk")
	public String cookieChk(HttpServletResponse response) {
		Cookie cook = new Cookie("myCookie", "aaa");
		cook.setMaxAge(10);
		cook.setPath("/");
		response.addCookie(cook);
		return "popup";
	}
}
