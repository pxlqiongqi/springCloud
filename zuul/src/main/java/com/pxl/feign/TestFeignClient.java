package com.pxl.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(name="eurekaClient")
public interface TestFeignClient {
	@RequestMapping(value="/test",method=RequestMethod.POST)
	@ResponseBody
	public String getMessage();
	
}
