package com.bjsxt.springboothelloworld.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloWorldController {
	
	@Value("${msg}")
	private String msg;

	@RequestMapping("/hello")
	public String showMsg(){

	    String str="日志编码utf-8";
		log.info("测试日志:{}",str);
		return this.msg;
	}

}
