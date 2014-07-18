package com.qycloud.oatos.ty.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/rest")
public class RestController {
	
	@RequestMapping("/reg")
	public @ResponseBody String register(){
		
		System.out.println("reqeuzt us ");
		return "register";
	}
	
	@RequestMapping("/login")
	public @ResponseBody String login(){
		
		System.out.println("login us ");
		return "login";
	}
	
	
	
}
