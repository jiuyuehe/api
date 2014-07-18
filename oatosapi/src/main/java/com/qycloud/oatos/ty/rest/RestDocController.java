package com.qycloud.oatos.ty.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class RestDocController {
	
	@RequestMapping(value = "/doc", method = RequestMethod.GET)
	public @ResponseBody String index(){
		return "index";
	}
}
