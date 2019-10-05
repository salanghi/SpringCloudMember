package com.helx.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

	@Value("${server.port}")
	String port;
	
	@RequestMapping("/getMsg")
	public String getMsg() {
		System.out.println("注册到Eureka,port:"+port);
		return "注册到Eureka,port:"+port;
	}
}
