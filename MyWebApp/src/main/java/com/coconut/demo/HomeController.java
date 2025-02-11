package com.coconut.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {	
	
	@RequestMapping("home")
	public String home(@RequestParam("name") String myName,HttpSession session) {
		System.out.println("Welcome home "+ myName);
		System.out.println(session.getMaxInactiveInterval());
		session.setAttribute("brand",myName);
		return "home.html";
		
	}
}
