package com.pxl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.pxl.feign.TestFeignClient;

@Controller
public class TestController {
	@Autowired
	private TestFeignClient testFeignClient;
	@RequestMapping("/test")
	@ResponseBody
	@HystrixCommand(fallbackMethod="getMessagefallback")
	public String getMessage() {
		return testFeignClient.getMessage();
	}
	public String getMessagefallback() {
		return testFeignClient.getMessage();
	}
}
