package com.cjc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller 
{
	@Value(value="${abc.msg}")
	private String message;

	@RequestMapping("/")
	public String prelogin()
	{
		return message;
	}
}
