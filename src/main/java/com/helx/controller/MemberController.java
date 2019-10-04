package com.helx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

	@RequestMapping("/getMsg")
	public String getMsg() {
		return "注册到Eureka";
	}
}
