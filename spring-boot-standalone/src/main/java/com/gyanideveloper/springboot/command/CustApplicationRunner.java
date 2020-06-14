package com.gyanideveloper.springboot.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.gyanideveloper.springboot.service.HelloService;

@Component
public class CustApplicationRunner implements ApplicationRunner {

	@Autowired
	private HelloService helloService;

	private static final Logger logger = LoggerFactory.getLogger(CustApplicationRunner.class);

	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.info(helloService.sayHello("Gyani Developer"));
	}

}
