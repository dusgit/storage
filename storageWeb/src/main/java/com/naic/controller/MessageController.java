package com.naic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("message")
public class MessageController {

	@RequestMapping("send")
	public String send(){
		return "hello w";
	}
}
