package com.naic.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("message")
public class MessageController {

	Logger logger = LoggerFactory.getLogger(MessageController.class);
	@RequestMapping("send")
	public String send(){
		logger.info("logger message info");
		logger.warn("logger message warn");
		logger.error("logger message error");
		return "hello w";
	}
}
