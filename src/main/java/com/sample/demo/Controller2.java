package com.sample.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {
	@RequestMapping("/page1")
	public String func()
	{
		return "Another page using Sprinboot";
	}

}
