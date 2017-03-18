package com.yifei.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/heal")
@Component
public class HealthCheckController {
	
	@RequestMapping("/testd")
	@ResponseBody
	public String checkHealth(){
		System.out.println("11111111111111111");
		return "ok";
	}

}
