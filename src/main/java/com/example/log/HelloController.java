package com.example.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
	Logger logger = LoggerFactory.getLogger(HelloController.class);
		
	@RequestMapping("/hello")
	public String sayHello()
	{
		logger.debug("hello debug level");
		
		return "hello";
	}

}
